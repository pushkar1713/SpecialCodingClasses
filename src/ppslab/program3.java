package ppslab;

import java.util.Scanner;

public class program3 {
        public static void main(String[] args) {
            System.out.println("Input the radius of the circle :");
            Scanner sc = new Scanner(System.in);
            float r;
            r=sc.nextFloat();
            System.out.println("The area is :" + r*3.14*r + '\n' + "The circumference is:" +2*3.14*r );
            sc.close();
        }

    }
