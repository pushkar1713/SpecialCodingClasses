package ppslab;

import java.util.Scanner;

public class program13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number : ");
        double n = sc.nextDouble();
        double f = 1f;
        for (int i = 1; i <=n ; i++) {
            f = f*i;

        }
        System.out.println("The factorial is : "+ f);
    }
}
