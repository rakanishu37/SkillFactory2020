package net.Avalith.CollectionsInterfaces.Ej3;

import java.util.ArrayList;

/**
 * Escribir un método removeEvenLength() que reciba un ArrayList de String y elimine todos los String de longitud par
 */
public class Ej3Main {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("even");
        words.add("odd");
        System.out.println(words);
        removeEvenLength(words);
        System.out.println(words);
    }

    public static void removeEvenLength(ArrayList<String> elements){
        for(int i = 0; i < elements.size();++i){
            if(elements.get(i).length() %2 == 0){
                elements.remove(i);
            }
        }
    }
}
