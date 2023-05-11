package ppslab;

import java.util.Scanner;

public class program21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of elements : ");
        int n = sc.nextInt();
        int sum=0;

        int[] arr = new int[n];
        System.out.println("Input the elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum=sum+arr[i];
        }
        System.out.println("the sum of the elements is : " + sum);
    }
}
