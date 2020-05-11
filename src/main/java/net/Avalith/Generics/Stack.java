package net.Avalith.Generics;

import java.util.LinkedList;

public class Stack <T extends Comparable<T>>{
    private LinkedList<T> stack;

    public Stack() {
        stack = new LinkedList<>();
    }

    public void push(T element) {
        stack.add(element);
    }

    public T pop() {
        return stack.pollLast();
    }

    public T top(){
        return stack.peekLast();
    }

    public Integer size() {
        return stack.size();
    }

    public T getMax(){
        T max = null;
        max = stack.getFirst();
        for(T element : stack){
            if(max.compareTo(element) < 0){
                max = element;
            }
        }
        return max;
    }

    public T getMin(){
        T min = null;
        min = stack.getFirst();
        for(T element : stack){
            if(min.compareTo(element) > 0){
                min = element;
            }
        }
        return min;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Top\n");
        T element = null;

        for (int i = stack.size() - 1; i >= 0; i--){
            sb.append(stack.get(i) + "\n");
        }
        sb.append("Base");
        return sb.toString();
    }
}
