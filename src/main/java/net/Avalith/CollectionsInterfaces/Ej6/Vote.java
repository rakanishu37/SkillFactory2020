package net.Avalith.CollectionsInterfaces.Ej6;

public class Vote {
    private ClubMember member;
    private Integer voteQuantity;

    public Vote(ClubMember member) {
        this.member = member;
        this.voteQuantity = 0;
    }


    public void addVote(){
        voteQuantity++;
    }

    public ClubMember getMember(){
        return member;
    }

    public Integer getVoteQuantity(){
        return voteQuantity;
    }
}
