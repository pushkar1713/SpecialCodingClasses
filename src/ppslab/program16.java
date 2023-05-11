package ppslab;

import java.util.Scanner;

public class program16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number : ");
        int n = sc.nextInt();
        int flag =0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                flag = 1;
                break;
            }
        }
        if (flag==1)
            System.out.println("The given number is not prime");
        else
            System.out.println("The given number is prime");


        }
    }

