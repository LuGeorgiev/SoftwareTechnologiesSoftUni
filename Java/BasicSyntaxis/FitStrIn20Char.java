package Homework;

        import java.util.Scanner;

public class FitStrIn20Char {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        StringBuilder result = new StringBuilder();
        if (input.length()>=20){
            for (int i = 0; i < 20; i++) {
                char c = input.charAt(i);
                result.append(c);
            }
        }
        else   {
            result.append(input);
            for (int i = input.length(); i < 20; i++) {
                result.append('*');
            }
        }
        System.out.println(result);
    }
}
