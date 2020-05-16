package net.Avalith.FunctionalInterfaces.Ej5;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/**
 * 5) Recorrer un HashMap<Integer,String> utilizando un Biconsumer e imprimir sus keys y values ,
 * de a 1 entrada por vez solo si el largo del value de esa entrada (string) es mayor a 10.
 *  Sino imprimir alguna otra cosa.
 */
public class Ej5 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(34,"Pablico clavo un clavito");
        map.put(123,"Onomatopeya");
        map.put(43,"qwerty");
        map.put(546,"SkillFactory2020");
        BiConsumer<Integer,String> biConsumer =
                (key, value) -> {
                    if(value.length() > 10){
                        System.out.println(String.format("Key: %d\nValue: %s\n",key,value));
                    }
                    else{
                        System.out.println("Value not long enough");
                    }
                };
        map.forEach(biConsumer);
    }

}
