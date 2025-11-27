package ua.opnu.task2;

import java.util.Arrays;

class BookData implements Comparable<BookData> {
    private String title;
    private String author;
    private int reviews;
    private double total;

    BookData(String title, String author, int reviews, double total) {
        this.title = title;
        this.author = author;
        this.reviews = reviews;
        this.total = total;
    }

    @Override
    public int compareTo(BookData bookData2) {
        double thisRating = this.getRating();
        double otherRating = bookData2.getRating();

        if (thisRating > otherRating) return -1;
        if (thisRating < otherRating) return 1;

        return this.title.compareTo(bookData2.title);
    }

    public double getRating() {
        if (reviews == 0) return 0;
        return total / reviews;
    }

    @Override
    public String toString() {
        return "BookData{" +
                "title='" + title + '\'' +
                ", rating=" + getRating() +
                '}';
    }

    public static void main(String[] args) {
        BookData b1 = new BookData("The Lord of the Rings", "J.R.R. Tolkien", 500, 2450);
        BookData b2 = new BookData("Harry Potter", "J.K. Rowling", 300, 1350);
        BookData b3 = new BookData("The Witcher", "Andrzej Sapkowski", 200, 860);
        BookData b4 = new BookData("The Hobbit", "J.R.R. Tolkien", 500, 2250);

        BookData[] books = { b1, b2, b3, b4 };

        System.out.println("Before sort:");
        System.out.println(Arrays.toString(books));

        Arrays.sort(books);

        System.out.println("After sort:");
        System.out.println(Arrays.toString(books));
    }
}

