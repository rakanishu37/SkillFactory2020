package SkillFactory.Ej1;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Numbers {
    private List<Integer> numbers;

    public Numbers() {
        numbers = new ArrayList<>();
    }

    public Boolean addNumber(Integer n) {
        return numbers.add(n);
    }

    public Boolean removeNumber(Integer n) {
        return numbers.remove(n);
    }

    public List<Integer> getList() {
        return numbers;
    }


    public String showNumbers1() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numbers.size(); ++i) {
            sb.append(numbers.get(i));
            sb.append(",");
        }
        return sb.toString();
    }

    public String showNumbers2() {
        StringBuilder sb = new StringBuilder();
        for(Integer n: numbers){
            sb.append(n);
            sb.append(",");
        }
        return sb.toString();
    }

    public String showOrderedNumbers(){
        numbers.sort(Integer::compareTo);
        return showNumbers1();
    }

    public String showReversedOrderedNumbers(){
        numbers.sort(Collections.reverseOrder());
        return showNumbers2();
    }

}