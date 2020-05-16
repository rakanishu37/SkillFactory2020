package net.Avalith.Strings.Ej4;

/**
 * 4) Escribir un método, que dado un String cuente diferentes tipos de caracteres. Deberá
 * imprimir el número de letras, dígitos y espacios en blanco de la cadena.
 * Input: “Soy Independiente, aunque no gano la libertadores
 * desde 1985, sigo siendo el máximo campeón con 7 copas”
 * Output: N/A
 * Screen: Dígitos: 5 Letras: 80 Espacios: 16
 */
public class Ej4 {
    public static void main(String[] args) {

        countLetterNumbersWhitespaces("Soy Independiente, aunque no gano la libertadores desde 1985, sigo siendo el máximo campeón con 7 copas");
    }

    private static void countLetterNumbersWhitespaces(String s) {
        int letters = 0;
        int whitespace = 0;
        int numbers = 0;
        for(int i = 0; i < s.length(); i++){
            Character character = s.charAt(i);

            if(Character.isDigit(character)){
                numbers ++ ;
            }
            else{
                if(Character.isLetter(character)){
                    letters++ ;
                }
                else{
                    if(Character.isSpaceChar(character)){
                        whitespace ++ ;
                    }
                }
            }
        }
        System.out.println(String.format("Numbers: %d\nLetters: %d\nWhitespaces: %d",numbers,letters,whitespace));
    }
}
