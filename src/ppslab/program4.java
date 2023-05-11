package ppslab;

import java.util.Scanner;

public class program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the temperature in centigrade : ");
        double temp = sc.nextFloat();
        double f ;
        f = (1.8*temp) + 32;
        System.out.println(" The temperature in Fahrenheit is :" + f);
        sc.close();
    }
}
