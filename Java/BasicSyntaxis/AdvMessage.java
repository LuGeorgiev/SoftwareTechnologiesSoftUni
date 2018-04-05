package Homework;

import java.util.Random;
import java.util.Scanner;

public class AdvMessage {
    public static void main(String[] args) {
        String[] phrases = new String[]{"Excellent product.", "Such a great product.", "I always use that product.",
                "Best product of its category.", "Exceptional product.", "I can't live without this product."};
        String[] events = new String[] {"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"};
        String[] authors = new String[] {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        String[] cities = new String[] {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

        Random rand = new Random();

        Scanner scan = new Scanner(System.in);
        int messages = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < messages; i++) {
            String phrase  = phrases[rand.nextInt(phrases.length-1)];
            String event  = events[rand.nextInt(events.length-1)];
            String author  = authors[rand.nextInt(authors.length-1)];
            String city  = cities[rand.nextInt(cities.length-1)];

            System.out.println(phrase +" "+event+" "+author+" - "+city);
        }
    }
}
