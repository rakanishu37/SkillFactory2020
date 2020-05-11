package net.Avalith.Strings.Ej2;

import java.util.HashMap;
import java.util.Map;

public class RomanNumberConvertor {
    Map<String,Integer> romanNumberTable;

    public RomanNumberConvertor() {
        this.romanNumberTable = new HashMap<>();
        fillMap();
    }

    private void fillMap() {
        romanNumberTable.put("I",1);
        romanNumberTable.put("V",5);
        romanNumberTable.put("X",10);
        romanNumberTable.put("L",50);
    }

    public Integer convert(String romanNumber){
        Integer total = 0;
        Integer prev = 0;
        Integer actual = 0;

        String[] letters = romanNumber.split("");

        if(letters.length == 1){
            total = romanNumberTable.get(letters[0]);
        }
        else {
            for (int i = 1; i < letters.length; i++) {
                prev = romanNumberTable.get(letters[i - 1]);
                actual = romanNumberTable.get(letters[i]);
                if (actual > prev) {
                    total += (actual - prev);
                } else {
                    total += actual;
                }
            }
            total+= romanNumberTable.get(letters[letters.length-1]);
        }
        return total;
    }


}
