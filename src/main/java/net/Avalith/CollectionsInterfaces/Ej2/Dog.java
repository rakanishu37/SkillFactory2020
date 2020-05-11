package net.Avalith.CollectionsInterfaces.Ej2;

public class Dog implements IMarathoner {
    private Float kilometersPerHour;

    public Dog(Float kilometersPerHour) {
        this.kilometersPerHour = kilometersPerHour;
    }

    public String getSpecie(){
        return "Dog";
    }
    @Override
    public Double run(Double distance) {
        return distance/kilometersPerHour;
    }
}
