package Homework;

import java.util.Scanner;

public class CensorEmailAddress {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String email = scan.nextLine();
        String text = scan.nextLine();

        StringBuilder censoredMail = new StringBuilder();
        int atIndex = email.indexOf('@');
        for (int i = 0; i < atIndex; i++) {
            censoredMail.append('*');
        }
        String domain = email.substring(atIndex);
        censoredMail.append(domain);

        String result = text.replace(email,censoredMail);
        System.out.println(result);
    }
}
