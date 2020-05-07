package SkillFactory.Ej2;

public class Ej2Main {
    public static void main(String[] args) {
        Human h = new Human(5f);
        Dog d = new Dog(6f);
        Robot r = new Robot(20f);

        Marathon m = new Marathon(10d);
        m.addMarathoner(h);
        m.addMarathoner(d);
        m.addMarathoner(r);

        System.out.println(m.showResults());
    }
}
