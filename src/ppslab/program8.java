package ppslab;

import java.util.Scanner;

public class program8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a Number :");
        int a = sc.nextInt();
        if(a%2==0){
            System.out.println("The number is even");

        }
        else{
            System.out.println("The number is odd");
        }
        sc.close();
    }
}
