package net.Avalith.FunctionalInterfaces.Ej4;

import java.util.function.Function;
import java.util.function.Supplier;

/**
     * Buscar que interfaz se usaria para tirar una excepcion cuando se recibe un String y su largo no es
     * mayor a 1, sino, devolver el largo del String.
 */
public class Ej4 {
    public static void main(String[] args) {

        Function<String,Integer> countLetter = word -> countLetters(word);

        countLetter.apply("a");
    }

    public static Integer countLetters (String word) throws IllegalStateException{
        if(word.length()>1){
            return word.length();
        }
        else{
            throw new IllegalStateException("Word too short");
        }
    }
}
