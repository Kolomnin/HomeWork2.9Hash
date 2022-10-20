package hw2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

   static Set<Integer> number = new HashSet<>();

    public static void main(String[] args) {
        for (Integer i = 0; i < 20; i++) {
            number.add((int) Math.round(Math.random() * 1000));
        }
        System.out.println(number);
        removeNumber((HashSet<Integer>) number);
        System.out.println(number);
    }
    public static void removeNumber(HashSet<Integer> set) {
        Iterator<Integer> numbers = set.iterator();
        Integer i;
        while (numbers.hasNext()) {
            i = numbers.next();
            if (i%2==1) {
                numbers.remove();
            }
        }
    }
}





