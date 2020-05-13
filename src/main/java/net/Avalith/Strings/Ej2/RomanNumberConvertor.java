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
       /* List<Character> letters = romanNumber.chars()
                .mapToObj(e -> (char) e).collect(Collectors.toList());


        Integer total = 0;
        Integer next = 0;
        Integer actual = 0;

        if (letters.size() == 1) {
            return getValue(letters.get(0));
        }
        int i;
        for (i = 0; i < letters.size(); i++) {
            actual = getValue(letters.get(i));

            if(i+1 < letters.size()){
                next = getValue(letters.get(i + 1));

                if (actual >= next) {
                    total += actual;
                }
                else{
                    total += next - actual;
                }
            }
            else {
                total += actual;
            }
        }
        return total;
    }*/

    {
        // Initialize result
        List<Character> letters = romanNumber.chars()
                .mapToObj(e -> (char) e).collect(Collectors.toList());

        int total = 0;

        for (int i=0; i<letters.size(); i++)
        {
            // Getting value of symbol s[i]
            int actual = getValue(letters.get(i));

            // Getting value of symbol s[i+1]
            if (i+1 <letters.size())
            {
                int next = getValue(letters.get(i+1));

                // Comparing both values
                if (actual >= next)
                {
                    // Value of current symbol is greater
                    // or equalto the next symbol
                    total = total + actual;
                }
                else
                {
                    total = total + next - actual;
                    i++; // Value of current symbol is
                    // less than the next symbol
                }
            }
            else
            {
                total = total + actual;
                i++;
            }
        }

        return total;
    }  }
}
