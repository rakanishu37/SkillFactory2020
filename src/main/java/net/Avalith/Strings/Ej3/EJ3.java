package net.Avalith.Strings.Ej3;

import java.util.Arrays;
import java.util.List;

/**
 *  Escribir un método, que dado un String reordena las palabras de atrás hacia adelante
 * Input: “Arriba la Birra”
 * Output: “Birra la Arriba”
 */
public class EJ3 {
    public static void main(String[] args) {
        String phrase = "Arriba la Birra";
        System.out.println(reverseWords(phrase));
    }

    public static String reverseWords(String phrase){
        List<String> words = Arrays.asList(phrase.split(" "));

        StringBuilder sb = new StringBuilder();
        for(int i= words.size() -1; i >= 0; i--){
            sb.append(words.get(i)+" ");
        }
        return sb.toString();
    }
}
