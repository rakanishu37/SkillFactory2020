package net.Avalith.Strings.Ej3;

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
        String[] words = phrase.split(" ");

        StringBuilder sb = new StringBuilder();
        for(int i=words.length-1; i>=0; i--){
            sb.append(words[i]+" ");
        }
        return sb.toString();
    }
}
