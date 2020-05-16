package net.Avalith.Strings.Ej6;

/**
 * Crear un método que verifique que el String ingresado cumpla las siguientes reglas.
 * ● Regular el tamaño del String. Debe tener al menos 8 caracteres y máximo 30
 * ● El String debe contener solo caracteres alfanuméricos y guiones bajos (‘_’)
 * ● Generar una validación para que el primer carácter debe ser si o si alfanumérico
 * ● EXclusivamente el String debe contener al menos una mayúscula, una minúscula y
 * un número
 * Input: “PepePateatraseros123”
 * Output: True
 * Input: “RegEx101.com”
 * Output: False
 */
public class Ej6 {
    public static void main(String[] args) {
        String regex = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])[A-Za-z0-9][A-Za-z0-9_]{7,29}$";
        String message = "Primero de mayo";
        Boolean matches = message.matches(regex);
        System.out.println(matches);

        message = "435435435";
        matches = message.matches(regex);
        System.out.println(matches);

        message ="qWe_123";
        matches = message.matches(regex);
        System.out.println(matches);
    }


}
