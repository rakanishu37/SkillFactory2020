package SkillFactory.Ej4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Escribir un método que reciba n cantidad de Integer (no un número fijo) y una List, los ordene dentro de un ArrayList
 * e imprimir por pantalla.
 * Luego convertir este Arraylist en LinkedList y repetir el proceso.
 */
public class Ej4Main {
    public static void main(String[] args) {
        List list = null;
        method(list,2,8,4,1,-6,3);
    }

    public static void method(List<Integer> list, Integer... numbers){
        list = new ArrayList<>();
        for(Integer number : numbers){
            list.add(number);
        }
        Collections.sort(list);
        System.out.println(list);
        list = new LinkedList<>(list);
        System.out.println(list);
    }
}
