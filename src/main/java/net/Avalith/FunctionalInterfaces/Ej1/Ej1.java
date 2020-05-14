package net.Avalith.FunctionalInterfaces.Ej1;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Crear un Function que devuelva el módulo a elección de un numero entero.
 */
public class Ej1 {
    public static void main(String[] args) {
       BiFunction<Integer,Integer,Integer> module = (number,moduleValue) -> number % moduleValue ;

       System.out.println(module.apply(4, 2));

    }

    
}