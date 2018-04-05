package Homework;

import java.util.Arrays;
import java.util.Scanner;

public class IntersectionOfCircles {
    private static class Circle{
       private double xAxis;
       private double yAxis;
       private double radius;

       public Circle(double x, double y, double radius){
           this.xAxis = x;
           this.yAxis = y;
           this.radius = radius;
       }
       public static boolean intersect(Circle first , Circle second){
            double centersDistance = Math.sqrt((first.xAxis-second.xAxis)*(first.xAxis-second.xAxis)+
                    (first.yAxis-second.yAxis)*(first.yAxis-second.yAxis));
            if (centersDistance<=first.radius+second.radius){
                return true;
            }
            else{
                return false;
            }
       }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] firstCircleInfo = Arrays.stream(scan.nextLine().split(" "))
                .mapToDouble(Double::parseDouble).toArray();
        double[] secondCircleInfo = Arrays.stream(scan.nextLine().split(" "))
                .mapToDouble(Double::parseDouble).toArray();
        double xAxis =firstCircleInfo[0];
        double yAxis =firstCircleInfo[1];
        double radius =firstCircleInfo[2];
        Circle circOne = new Circle(xAxis,yAxis,radius);

        xAxis =secondCircleInfo[0];
        yAxis =secondCircleInfo[1];
        radius =secondCircleInfo[2];
        Circle circTwo = new Circle(xAxis,yAxis,radius);

        boolean areIntersected = Circle.intersect(circOne,circTwo);

        if (areIntersected){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}


