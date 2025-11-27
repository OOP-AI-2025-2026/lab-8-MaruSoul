package ua.opnu.task6;

public class Task6 {
    public static void main(String[] args) {
        GenericTwoTuple<String, Double> bookRating =
                new GenericTwoTuple<>("The Lord of the Rings", 4.9);
        System.out.println("Book rating: " + bookRating);

        GenericThreeTuple<String, Integer, Boolean> studentExam =
                new GenericThreeTuple<>("Kate Davydovych", 100, true);
        System.out.println("Student exam: " + studentExam);

        GenericThreeTuple<String, String, Integer> bookInfo =
                new GenericThreeTuple<>("The Hobbit", "J.R.R. Tolkien", 310);
        System.out.println("Book info: " + bookInfo);

        System.out.println("Title:  " + bookInfo.getFirst());
        System.out.println("Author: " + bookInfo.getSecond());
        System.out.println("Pages:  " + bookInfo.getThree());
    }
}
