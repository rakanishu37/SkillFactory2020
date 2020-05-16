package net.Avalith.FunctionalInterfaces.Ej3;

import java.util.function.BiFunction;

/**
 * Utilizar una interfaz Bifunction la cual reciba 2 strings y retorne un entero con los largos de ambos
 * strings sumados.
 */
public class Ej3 {
    public static void main(String[] args) {
        BiFunction<String,String,Integer> wordslengthSumed = (firstWord, secondWord) -> firstWord.length() + secondWord.length();

        System.out.println(wordslengthSumed.apply("hola","hola"));
    }
}