package Homework;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String toReverse = scan.nextLine();
        StringBuilder reversed = new StringBuilder();

        for (int i = toReverse.length()-1; i >=0; i--) {
            char c = toReverse.charAt(i);
            reversed.append(c);
        }

        System.out.println(reversed);
    }
}
