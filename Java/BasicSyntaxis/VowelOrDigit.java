package Homework;

import java.util.Scanner;

public class VowelOrDigit {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        char symbol = scn.next().charAt(0);

        if ( 48<=symbol&&symbol<=57){
            System.out.println("digit");
        }
        else if(symbol=='a'||symbol=='e'||symbol=='u'||symbol=='y'||symbol=='i'||symbol=='o'){
            System.out.println("vowel");
        }
        else{
            System.out.println("other");
        }
    }
}
