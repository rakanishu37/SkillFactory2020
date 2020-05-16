package net.Avalith.FunctionalInterfaces.Ej2;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.function.Supplier;

import javax.sound.sampled.SourceDataLine;

/**
 * Utilizar una interfaz Supplier en un método de una clase que tenga como atributo una fecha (el
 * Supplier devuelve un timestamp actual). Puede hacerse pasando el objeto Supplier o pasando un
 * lamda a un método.
 */
public class Ej2 {
    public static void main(String[] args) {
        System.out.println(Instant.now());
        Supplier<LocalDateTime> getActualTimestamp = LocalDateTime::now;

        tellActualTime(getActualTimestamp.get());
    }
 
    public static void tellActualTime(LocalDateTime timestamp){        
        System.out.println(String.format("Time : %s", timestamp.toString()));
    }
}