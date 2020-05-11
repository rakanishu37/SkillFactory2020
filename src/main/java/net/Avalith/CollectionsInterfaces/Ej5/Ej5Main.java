package net.Avalith.CollectionsInterfaces.Ej5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Llenar un ArrayList con objetos Car (String model, Integer prize), cargar algunos varias veces,
 * luego eliminar los repetidos
 */
public class Ej5Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Car c1 = new Car("m1",1000);
        Car c2 = new Car("m2",150);
        Car c3 = new Car("m3",80000);

        cars.add(c1);
        cars.add(c2);
        cars.add(c1);
        cars.add(c3);
        cars.add(c3);
        System.out.println(cars);
        cars = cars.stream().distinct().collect(Collectors.toCollection(ArrayList::new));
        System.out.println(cars);
    }
}
