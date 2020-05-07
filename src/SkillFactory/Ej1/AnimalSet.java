package SkillFactory.Ej1;

import java.util.HashSet;
import java.util.Set;

public class AnimalSet {
    private Set<String> animals;

    public AnimalSet() {
        this.animals = new HashSet<>();
    }

    public Boolean addAnimal(String animal){
        return this.animals.add(animal);
    }

    public Boolean removeAnimal(String animal){
        return this.animals.remove(animal);
    }

    public Set<String> getAnimalSet(){
        return this.animals;
    }

    public String showAnimals(){
        StringBuilder sb = new StringBuilder();
        for(String animal : animals){
            sb.append(animal+"\n");
        }
        return sb.toString();
    }
}
