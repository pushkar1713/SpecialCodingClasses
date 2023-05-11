package ppslab;

import java.util.Scanner;

public class program9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a Year : ");
        int n = sc.nextInt();
        if ((n%4==0 && n%100!=0) || (n%400==0))
            System.out.println("The given year is leap");
        else
            System.out.println("The given year is not leap");
    }
}
