package Homework;

import java.util.Scanner;

public class BooleanVariables {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        String input = scan.nextLine();
        if (input.equals("True")){
            System.out.println("Yes");

        } else {
            System.out.println("No");
        }
    }
}
