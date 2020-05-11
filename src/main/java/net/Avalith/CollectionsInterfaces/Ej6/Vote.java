package net.Avalith.CollectionsInterfaces.Ej6;

public class Vote {
    private ClubMember member;
    private Integer voteQuantity;
    private Boolean hasVoted;

    public Vote(ClubMember member) {
        this.member = member;
        this.voteQuantity = 0;
        hasVoted = false;
    }

    public void setVote(Boolean value){
        hasVoted = value;
    }

    public void addVote(){
        voteQuantity++;
    }

    public Boolean getHasVoted(){
        return hasVoted;
    }

    public ClubMember getVoter(){
        return member;
    }

    public Integer getVoteQuantity(){
        return voteQuantity;
    }
}
