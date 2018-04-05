package Homework;

import java.util.Scanner;

public class IndexOfLetters {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        char[] charsLine = scan.nextLine().toCharArray();

        for (int i = 0; i < charsLine.length; i++) {
            char c = charsLine[i];

            System.out.printf("%s -> %d%n",c,c-97);

        }
    }
}
