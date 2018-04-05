package Homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BombNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] intLine = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        ArrayList<Integer> numbersToBomb =new ArrayList<>();
        for (int i : intLine) {
            numbersToBomb.add(i);
        }

        int[] intCommands = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int bombNumber = intCommands[0];
        int bombPower = intCommands[1];

        while (true){
            int bombIndex = numbersToBomb.indexOf(bombNumber);
            if (bombIndex==-1){
                break;
            }

            int startIndex = bombIndex-bombPower<0 ? 0 : bombIndex-bombPower;
            int endIndex = bombIndex+bombPower>numbersToBomb.size()-1 ? numbersToBomb.size()-1 : bombIndex+bombPower;

            for (int i = endIndex; i >= startIndex; i--) {
                numbersToBomb.remove(i);
            }
        }

        int sum=0;
        for (Integer integer : numbersToBomb) {
            sum+=integer;
        }

        System.out.println(sum);
    }
}
