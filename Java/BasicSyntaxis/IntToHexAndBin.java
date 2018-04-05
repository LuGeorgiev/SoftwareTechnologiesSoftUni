package Homework;

        import java.util.Scanner;

public class IntToHexAndBin {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        int numb = Integer.parseInt(scan.nextLine());
        System.out.println(Integer.toHexString(numb).toUpperCase());
        System.out.println(Integer.toBinaryString(numb));



    }
}
