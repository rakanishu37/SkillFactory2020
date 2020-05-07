package SkillFactory.Ej2;

public class Human implements IMarathoner{
    private Float kilometersPerHour;

    public Human(Float kilometersPerHour) {
        this.kilometersPerHour = kilometersPerHour;
    }

    public String getSpecie(){
        return "Human";
    }
    @Override
    public Double run(Double distance) {
        return distance/kilometersPerHour;
    }
}
