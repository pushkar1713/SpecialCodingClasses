package ppslab;

import java.util.Scanner;

public class program14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a Number : ");
        int n = sc.nextInt();
        int odd=0;
        int even=0;
        for (int i = 1; i <=n; i++) {
            if (i%2==0){
                even = even+i;
            }
            else {
                odd=odd+i;
            }

        }
        System.out.println("The sum of even numbers is : "+even);
        System.out.println("The sum of odd numbers is : "+odd);
    }
}
