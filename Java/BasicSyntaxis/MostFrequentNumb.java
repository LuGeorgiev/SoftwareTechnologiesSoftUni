package Homework;

import java.util.*;

public class MostFrequentNumb {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] intLine= Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int maxCount =0;
        int mostFrequentNumber =0;

        Hashtable<Integer,Integer> numbersWithOccurency =new Hashtable<>();

        for (int i = 0; i < intLine.length; i++) {
            int currentNumb = intLine[i];

            if ( !numbersWithOccurency.containsKey(currentNumb)){
                numbersWithOccurency.put(currentNumb,0);
            }
            int count = numbersWithOccurency.get(currentNumb);
            numbersWithOccurency.put(currentNumb,++count);

            if ( maxCount<count){
                maxCount=count;
                mostFrequentNumber=currentNumb;
            }

        }

        System.out.println(mostFrequentNumber);
    }
}
