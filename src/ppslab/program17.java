package ppslab;

import java.util.Scanner;

public class program17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number : ");
        int n = sc.nextInt();
        int sum = 0;
        while (n!=0){
            int r = n%10;
            sum = sum +r;
            n=n/10;
        }
        System.out.println("The sum of the digits is : "+sum);
    }
}
