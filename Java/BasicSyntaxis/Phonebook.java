package Homework;

import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class Phonebook {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input =  scan.nextLine();
        SortedMap<String,String> phonebook = new TreeMap<>();

        while(!input.equals("END")){
            String[] commands = input.split(" ");
            String task = commands[0];
            String name = commands.length>1 ?  commands[1]:"";
            String phone = commands.length==3 ? commands[2] : "";
            if (task.equals("A")){
                phonebook.put(name,phone);
            }
            else if(task.equals("S")){
                if (phonebook.containsKey(name)){
                    System.out.printf("%s -> %s%n",name,phonebook.get(name));
                }
                else {
                    System.out.printf("Contact %s does not exist.%n",name);
                }
            }
            else{
                for (SortedMap.Entry<String,String> entry : phonebook.entrySet()) {
                    System.out.printf("%s -> %s%n",entry.getKey(),entry.getValue());
                }
            }
            input =  scan.nextLine();
        }
    }
}
