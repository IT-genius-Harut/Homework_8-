import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        System.out.println("___BOOK___");
        Book book = new Book(124, 6.4);
        Book book1 = new Book(134, 7);
        Book book2 = new Book(174, 10);
        Book book3 = new Book(224, 2.1);
        books.add(book);
        books.add(book1);
        books.add(book2);
        books.add(book3);
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i) );
        }
        double sum = 0;
        for (int i = 0; i < books.size(); i++) {
            sum += books.get(i).getRating();
        }
        System.out.println("sum = " + sum);
        System.out.println("average = " + sum / books.size());

        double max = books.get(0).getRating();
        for (int i = 0; i < books.size(); i++) {
            final double rating = books.get(i).getRating();
            if (rating > max) {
                max = rating;
            }
        }
        System.out.println("max rating = " + max);
        double min = books.get(0).getRating();
        for (int i = 0; i < books.size(); i++) {
            final double rating = books.get(i).getRating();
            if (rating < min) {
                min = rating;
            }
        }
        System.out.println("min rating = " + min);
        System.out.println("___BABY___");
        List<Baby> babies = new ArrayList<>();
        Baby baby = new Baby("abs");
        Baby baby1 = new Baby("absd");
        Baby baby2 = new Baby("abc");
        Baby baby3 = new Baby("PHP");
        babies.add(baby);
        babies.add(baby1);
        babies.add(baby2);
        babies.add(baby3);
        for (int i = 0; i < babies.size(); i++) {
            System.out.println(babies.get(i));
        }

    }
}
