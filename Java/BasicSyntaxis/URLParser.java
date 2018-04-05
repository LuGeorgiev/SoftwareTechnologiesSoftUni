package Homework;

import java.util.Scanner;

public class URLParser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String url = scan.nextLine();

        int index = url.indexOf("://");
        String protocol="";
        if (index>0){
            protocol=url.substring(0,index);
            url=url.substring(index+3);
        }

        String server ="";
        String resource ="";

        index=url.indexOf('/');
        if (index>0){
            server = url.substring(0,index);
            resource = url.substring(index+1);
        }
        else{
            server=url;
        }

        System.out.printf("[protocol] = \"%s\"%n",protocol);
        System.out.printf("[server] = \"%s\"%n",server);
        System.out.printf("[resource] = \"%s\"%n",resource);
    }
}
