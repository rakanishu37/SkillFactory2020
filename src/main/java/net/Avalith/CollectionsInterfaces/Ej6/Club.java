package net.Avalith.CollectionsInterfaces.Ej6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class Club {
    private Set<ClubMember> members;
    private Map<UUID,Vote> votes;
    private Set<UUID> census;

    public Club() {
        this.members = new HashSet<>();
        this.votes = new HashMap<>();
        this.census = new HashSet<>();
    }

    public void addMember(ClubMember member){
        members.add(member);
        votes.put(member.getId(),new Vote(member));
    }

    public void removeMember(ClubMember member){
        members.remove(member);
        votes.remove(member.getId());
    }

    private void removeVotingCapacity(UUID memberId){
        votes.remove(memberId);
    }

    public void vote(UUID voterId,UUID votedId){
        if( census.contains(voterId)){
            removeVotingCapacity(voterId);
        }
        else{
            votes.get(votedId).addVote();
            census.add(voterId);
        }
    }

    public String publishMemberList(){
        StringBuilder sb = new StringBuilder();
        return members.stream()
                        .map(ClubMember::getName)
                        .sorted()
                        .reduce("",(a,name) -> a + name + "\n");
    }

    public ClubMember publishMostVotedMember(){
        Vote topMember = null;
        for(Map.Entry<UUID,Vote> voted : votes.entrySet()){
            Vote voter = voted.getValue();
            if(topMember == null || topMember.getVoteQuantity() < voter.getVoteQuantity()){
                topMember = voter;
            }
        }
        return topMember.getMember();
    }

}
