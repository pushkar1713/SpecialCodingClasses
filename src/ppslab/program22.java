package ppslab;

import java.util.Scanner;

public class program22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number of elements for arrays: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] arr2 = new int[n];
        int[] arr3 = new int[n];
        System.out.println("Input the elements for array 1");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Input the elements for array 2");
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println("The new array is : ");
        for (int i = 0; i < n; i++) {
            arr3[i] = arr[i] + arr[i];
            System.out.print(arr3[i] + " ");
        }
    }
}
