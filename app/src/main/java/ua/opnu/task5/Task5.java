package ua.opnu.task5;


public class Task5 {

    public static <T extends Comparable<T>, V extends T> boolean contains(T[] array, V element) {

        for (T item : array) {
            if (item.compareTo(element) == 0) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String[] animals = {"cat", "dog", "bird"};

        System.out.println(contains(animals, "dog"));  // true
        System.out.println(contains(animals, "human"));  // false
    }
}
