package ppslab;

import java.util.Scanner;

public class program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input 2 numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int t;
        t=a;
        a=b;
        b=t;
        System.out.println("The swapped numbers are : ");
        System.out.println(a);
        System.out.println(b);
        sc.close();
    }
}
