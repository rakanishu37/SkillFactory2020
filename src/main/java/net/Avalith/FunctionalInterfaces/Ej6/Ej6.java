package net.Avalith.FunctionalInterfaces.Ej6;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * 6) Crear interfaces funcionales propias(que reciban valores o no, que devuelvan algo o no),
 * luego instanciarlas en una variable y ejecutar sus métodos).
 */
public class Ej6 {
    public static void main(String[] args) {
        EvenModuleNumber evenModuleNumber = (num, module) -> num % module == 0;
        Integer number = 3;
        Integer module = 2;
        System.out.println(String.format("The %d is even? %s",number,String.valueOf(evenModuleNumber.test(number,module))));

        TimeSupplier clock = () -> LocalDateTime.now();
        String day = clock.get().getDayOfWeek().toString();
        String time = clock.get().getHour() +":" + clock.get().getMinute();
        System.out.println(String.format("Today is %s and the hour is %s",day,time));
    }
}
