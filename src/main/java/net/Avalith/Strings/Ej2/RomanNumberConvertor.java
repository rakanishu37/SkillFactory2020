package net.Avalith.Strings.Ej2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RomanNumberConvertor {
    Map<Character, Integer> romanNumberTable;

    public RomanNumberConvertor() {
        this.romanNumberTable = new HashMap<>();
        fillMap();
    }

    private void fillMap() {
        romanNumberTable.put('I', 1);
        romanNumberTable.put('V', 5);
        romanNumberTable.put('X', 10);
        romanNumberTable.put('L', 50);
        romanNumberTable.put('C', 100);
        romanNumberTable.put('M', 1000);
    }

    private Integer getValue(Character c) throws Throwable {
        Integer value = romanNumberTable.get(c);
        if (value == null) {
            throw new Throwable("Letter not found");
        }
        return value;
    }

    public Integer convert(String romanNumber) throws Throwable {
        Integer total = 0;
        Integer next = 0;
        Integer actual = 0;

        List<Character> letters = romanNumber.chars()
                .mapToObj(e -> (char) e).collect(Collectors.toList());

        int i = 0;
        while(i <letters.size() - 1){
            actual = getValue(letters.get(i));
            next = getValue(letters.get(i+1));
            if(actual >= next){
                total += getValue(letters.get(i));
            }else{
                total -= getValue(letters.get(i));
            }
            i++;
        }
        total += getValue(letters.get(i));

        return total;
    }
}
