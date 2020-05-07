package SkillFactory.Ej2;

/**
 * Se va a realizar una carrera entre distintas “especies”. Crear las clases Human,  Dog y Robot. Cada objeto debe tener
 * una velocidad diferente como atributo (podría ser un random, pero en este caso debemos definir un rango
 * para cada especie) .
 * Las 3 clases deben implementar la interfaz Sprintable, la cual tiene un método qué es
 * public Double run(Double distance)
 * (el método recibe la distancia de la carrera (en kilómetros) que van a correr y devuelve el tiempo que
 * tardó dicho competidor, calculado con el “coeficiente” de velocidad de cada objeto).
 * Debemos crear una clase que se llame Marathon en la cual debemos cargar los objetos en una List o Sety luego debemos
 * iterar sobre dicha colección e ir imprimiendo el tiempo que realiza cada competidor.
 */
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
