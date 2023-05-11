package ppslab;

import java.util.Scanner;

public class program15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a Number : ");
        int n = sc.nextInt();
        int a;
        int b = 1;
        int c= 0;
        System.out.print("The fibonacci series upto "+ n+ " is : ");
        for (int i = 1; i <=n ; i++) {
            System.out.print(c + " ");
            a=b;
            b=c;
            c=a+b;
        }
    }
}
