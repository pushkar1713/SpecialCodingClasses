package ppslab;

import java.util.Scanner;

public class program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input 3 Numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b && a>c){
            System.out.println(a+ " is the greatest");
        }
        else if(b>a && b>c){
            System.out.println(b+ " is the greatest");
        }
        else{
            System.out.println(c+ " is the greatest");
        }
        sc.close();
    }
}
