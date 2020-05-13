package net.Avalith.Strings.Ej2;

/**
 * Escribir un método que, dado un String, transforme de Número Romano a Integer.
 * Input: “XIV”
 * Output: 14
 */
public class Ej2 {
    public static void main(String[] args) {
        RomanNumberConvertor convertor = new RomanNumberConvertor();
        try{
            //System.out.println(convertor.convert("X"));
            //System.out.println(convertor.convert("III"));
            //System.out.println(convertor.convert("II"));
            System.out.println(convertor.convert("MCMIV"));
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}
