package Homework.BookLibrary;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int bookCount = Integer.parseInt(scan.nextLine());
        Library library = new Library("Lubos Library");


        for (int i = 0; i < bookCount; i++) {
            String[] tokens = scan.nextLine().split(" ");

            String title = tokens[0];
            String author = tokens[1];
            String publisher = tokens[2];
            String releaseDate = tokens[3];
            String isbn = tokens[4];
            Double price = Double.parseDouble(tokens[5]);

            Book book = new Book(title, author, publisher, releaseDate, isbn, price);
            library.getBooks().add(book);
        }
        // Problem 24. Book Library
//        Map<String, Double> authorsSum = new LinkedHashMap<>();
//        for (Book book : library.getBooks()) {
//            if (!authorsSum.containsKey(book.getAuthor())) {
//                authorsSum.put(book.getAuthor(), 0d);
//            }
//            double oldValue = authorsSum.get(book.getAuthor());
//            authorsSum.put(book.getAuthor(), oldValue + book.getPrice());
//        }
//
//        authorsSum.entrySet()
//                .stream()
//                .sorted((a1, a2) -> {
//                    int compareResult = Double.compare(a2.getValue(), a1.getValue());
//                    if (compareResult == 0) {
//                        compareResult = a1.getKey().compareTo(a2.getKey());
//                    }
//                    return compareResult;
//                })
//                .forEach(a -> System.out.printf("%s -> %.2f%n", a.getKey(), a.getValue()));

        //Problem 25. Book Library Modification

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String dateAfterThis = scan.nextLine();
        LocalDate releasedAfterThis = LocalDate.parse(dateAfterThis, formatter);

        Map<String, LocalDate> bookDates = new LinkedHashMap<>();
        for (Book book : library.getBooks()) {
            LocalDate releaseDate = LocalDate.parse(book.getReleaseDate(), formatter);
            if (releaseDate.isAfter(releasedAfterThis)) {
                bookDates.put(book.getTitle(), releaseDate);
            }
        }
        bookDates.entrySet()
                .stream()
                .sorted((a1, a2) -> {
                    int compare = a1.getValue().compareTo(a2.getValue());
                    if (compare == 0) {
                        compare = a1.getKey().compareTo(a2.getKey());
                    }
                    return compare;
                })
                .forEach(a -> System.out.printf("%s -> %s%n"
                        , a.getKey(), a.getValue().format(DateTimeFormatter.ofPattern("dd.MM.yyyy"))));
    }
}
