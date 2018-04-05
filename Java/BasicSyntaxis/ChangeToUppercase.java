package Homework;

import java.util.Scanner;

public class ChangeToUppercase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text  = scan.nextLine();
        int inTag = text.indexOf("<upcase>");
        int outTag = text.indexOf("</upcase>",inTag);
        StringBuilder result = new StringBuilder();

        while(true){
            if (inTag==-1){
                result.append(text);
                break;
            }
            ;

            result.append(text.substring(0,inTag));
            result.append(text.substring(inTag+8,outTag).toUpperCase());

            text=text.substring(outTag+9);
            inTag = text.indexOf("<upcase>",0);
            outTag =text.indexOf("</upcase>",inTag);
        }

        System.out.println(result);
    }
}
