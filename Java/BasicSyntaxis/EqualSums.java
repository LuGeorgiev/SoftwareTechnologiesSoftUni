package Homework;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] intLine = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int totalSum = 0;
        for (int i = 0; i < intLine.length; i++) {
            totalSum += intLine[i];
        }

        boolean sumFound=false;
        for (int i = 0; i < intLine.length; i++) {
            int leftSum =0;
            int rightSum =0;
            //calculate Left Sum
            if (i==0){
                leftSum=0;
            }
            else {
                for (int j = 0; j < i; j++) {
                    leftSum+=intLine[j];
                }
            }
            //calc right sum
            rightSum = totalSum-leftSum-intLine[i];

            if (leftSum==rightSum ){
                System.out.println(i);
                sumFound=true;
                break;
            }
        }
        if (!sumFound) {
            System.out.println("no");
        }
    }
}
