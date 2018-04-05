package Homework;

import java.util.Scanner;

public class HexidecimalFrmat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Integer num = Integer.parseInt(input.nextLine(),16);

        System.out.println(num);
    }
}
