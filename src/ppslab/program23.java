package ppslab;

import java.util.Arrays;
import java.util.Scanner;

public class program23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number of elements");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Input the elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        Arrays.sort(arr);
        System.out.println("The maximum element is "+ arr[n-1]);
        System.out.println("The minimum element is " + arr[0]);

    }
}
