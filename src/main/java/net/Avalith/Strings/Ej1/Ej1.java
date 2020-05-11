package net.Avalith.Strings.Ej1;

/**
 * 1) Realizar un método el cual reciba un String y devuelva un Boolean si este es un palíndromo.
 * (Palabra o expresión que es igual si se lee de izquierda a derecha que de derecha a izquierda.)
 */
public class Ej1 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Arriba la birra"));
    }

    public static Boolean isPalindrome(String word){
        String str = word.replace(" ","");
        String reversed = new StringBuilder(str).reverse().toString();

        return str.equalsIgnoreCase(reversed);
    }
}
