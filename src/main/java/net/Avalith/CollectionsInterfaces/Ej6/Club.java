package net.Avalith.CollectionsInterfaces.Ej6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

public class Club {
    private Set<ClubMember> members;
    private Map<UUID,Vote> votes;

    public Club() {
        this.members = new HashSet<>();
        this.votes = new HashMap<>();
    }

    public void addMember(ClubMember member){
        members.add(member);
        votes.put(member.getId(),new Vote(member));
    }

    public void removeMember(ClubMember member){
        members.remove(member);
        votes.remove(member.getId());
    }

    private void removeVotingCapacity(ClubMember member){
        votes.remove(member.getId());
    }

    public void vote(UUID member,UUID votedId){
        Vote voter = votes.get(member);
        if(voter.getHasVoted()){
            removeVotingCapacity(voter.getVoter());
        }
        else{
            votes.get(member).setVote(true);
            votes.get(votedId).addVote();
        }
    }

    public String publishMemberList(){
        StringBuilder sb = new StringBuilder();
        List<String> memberListOrdered= members.stream()
                                                .map(ClubMember::getName)
                                                .sorted()
                                                .collect(Collectors.toList());
        memberListOrdered.forEach((name) -> sb.append(name+"\n"));
        return sb.toString();

    }

    public String publishMostVotedMember(){
        Vote topMember = null;
        for(Map.Entry<UUID,Vote> voted : votes.entrySet()){
            Vote voter = voted.getValue();
            if(topMember == null || topMember.getVoteQuantity() < voter.getVoteQuantity()){
                topMember = voter;
            }
        }
        return topMember.getVoter().getName();
    }

}
