package net.Avalith.Strings.Ej5;

/**
 * Realizar un método, el cual reciba un String y realice el cifrado Caesar. Se debe cambiar
 * cada letra por la siguiente.
 * Input: “abcde”
 * Output: “bcdef”
 */
public class Ej5 {
    public static void main(String[] args) {
        String converted = cesarCipher("abc");
        System.out.println(converted);
    }

    public static String cesarCipher(String string){
        StringBuilder sb= new StringBuilder();
        int asciiValue = 0;
        Character c = ' ';

        for (int i=0; i<string.length(); i++) {
            c = string.charAt(i);
            if (Character.isSpaceChar(c)) {
                sb.append(c);
            }
            else{
                if(Character.isLetter(c)){
                    asciiValue = (int) c + 1;

                    if (asciiValue == 122){
                        asciiValue = 97;
                    }
                    else{
                        if (asciiValue == 91){
                            asciiValue = 65;
                        }
                    }
                }
            }
            sb.append((char)asciiValue);
        }
        return sb.toString();
    }
}
