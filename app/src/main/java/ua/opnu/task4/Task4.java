package ua.opnu.task4;

import java.util.Arrays;
import java.util.function.Predicate;

public class Task4 {

    public static <T> T[] filter(T[] input, Predicate<T> predicate) {
        T[] result = (T[]) new Object[input.length];

        int counter = 0;
        for (int i = 0; i < input.length; i++) {
            if (predicate.test(input[i])) {
                result[counter] = input[i];
                counter++;
            }
        }

        return Arrays.copyOfRange(result, 0, counter);
    }

    public static void main(String[] args) {
        String[] words = {"cat", "car", "dog", "door"};
        Predicate<String> startsWithC = s -> s.startsWith("c");

        Object[] filtered = filter(words, startsWithC);
        System.out.println(Arrays.toString(filtered));
    }
}