package ppslab;

import java.util.Scanner;

public class program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a==b)
            System.out.println("The numbers are equal");
        else
            System.out.println("The numbers are not equal");
        sc.close();
    }
}
