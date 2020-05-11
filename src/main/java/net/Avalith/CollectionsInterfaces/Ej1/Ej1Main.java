package net.Avalith.CollectionsInterfaces.Ej1;

/**
 * Crear 3 clases. Cada una contiene una implementación (a elección) de las interfaces List, Map y Set.
 * Cargarlas con objetos(String, Integer u objetos propios si gusta) y luego realizar las operaciones básicas en cada una
 * (obtener, eliminar, leer e imprimir, iterar sobre la colección  e imprimir todos sus elementos uno a uno
 * (iterar de 2 formas diferentes al menos)).
 * También ordenar e invertir el orden de los elementos en la/s colección/es que sea posible.
 */
public class Ej1Main {
    public static void main(String[] args) {
        Numbers n = new Numbers();
        n.addNumber(1);
        n.addNumber(8);
        n.addNumber(3);
        n.addNumber(7);
        n.addNumber(-51);
        n.addNumber(6);
        n.addNumber(4);

        System.out.println(n.showNumbers1());
        System.out.println(n.showOrderedNumbers());
        System.out.println(n.showReversedOrderedNumbers());

        Person p1 = new Person("name1",20,"4581");
        Person p2 = new Person("name2",20,"1234");
        PeopleRegistry pr = new PeopleRegistry();
        pr.addPerson(p1);
        pr.addPerson(p2);

        System.out.println(pr.showRegistry1());
        System.out.println(pr.showRegistry2());
        System.out.println(pr.showRegistryOrderedByKeys());

        AnimalSet animalSet = new AnimalSet();
        animalSet.addAnimal("Cat");
        animalSet.addAnimal("Dog");
        animalSet.addAnimal("Turtle");
        animalSet.addAnimal("Dog");

        System.out.println(animalSet.showAnimals());
    }
}
