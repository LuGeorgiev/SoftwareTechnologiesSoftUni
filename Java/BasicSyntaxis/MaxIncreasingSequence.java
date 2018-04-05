package Homework;

import java.util.Arrays;
import java.util.Scanner;

public class MaxIncreasingSequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] line= Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int maxSequence =0;
        int indexOfMaxSequence =0;
        int curSequenceCount =1;
        for (int i = 1; i < line.length; i++) {
            if (line[i]>line[i-1]){
                curSequenceCount++;
                if (curSequenceCount >maxSequence){
                    maxSequence=curSequenceCount;
                    indexOfMaxSequence=i;
                }
            }
            else {
                curSequenceCount=1;
            }
        }

        for (int i = indexOfMaxSequence-maxSequence+1; i <= indexOfMaxSequence; i++) {
            System.out.print(line[i]+" ");
        }
    }
}
