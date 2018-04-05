package Homework;

import java.util.Arrays;
import java.util.Scanner;

public class CompareCharArrays {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        char[] firstArr = scan.nextLine().replaceAll(" ", "").toCharArray();
        char[] secondArr = scan.nextLine().replaceAll(" ", "").toCharArray();

        int shorterLen  = firstArr.length<secondArr.length ? firstArr.length :secondArr.length;
        boolean shorterFound  =false;

        for (int i = 0; i < shorterLen; i++) {

            if (firstArr[i]<secondArr[i]){
                printArray(firstArr);
                printArray(secondArr);

                shorterFound=true;

                break;
            }
            else if(firstArr[i]>secondArr[i]) {
                printArray(secondArr);
                printArray(firstArr);

                shorterFound = true;
                break;
            }

        }

        if (!shorterFound){
            if (firstArr.length<secondArr.length){
                printArray(firstArr);
                printArray(secondArr);

            }
            else{
                printArray(secondArr);
                printArray(firstArr);

            }
        }
    }

    static void printArray(char[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(String.valueOf(array[i]));


        }
        System.out.println();
    }
}
