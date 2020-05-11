package net.Avalith.CollectionsInterfaces.Ej2;

public class Robot implements IMarathoner {
    private Float kilometersPerHour;

    public Robot(Float kilometersPerHour) {
        this.kilometersPerHour = kilometersPerHour;
    }
    public String getSpecie(){
        return "Robot";
    }
    @Override
    public Double run(Double distance) {
        return distance/kilometersPerHour;
    }
}
