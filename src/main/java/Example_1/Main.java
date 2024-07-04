package Example_1;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        CounterFruits  counter = new CounterFruits ();
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("apple", "banana", "apple", "orange", "grape", "banana", "kiwi", "orange", "melon", "apple"));

        counter.count(fruits);
    }
}