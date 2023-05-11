package ppslab;

import java.util.Scanner;

public class program12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a Number : ");
        int n = sc.nextInt();
        int sum =0;
        for (int i = 1; i <=n ; i++) {
            sum = sum+i;

        }
        System.out.print("The sum is : "+sum);
    }
}
