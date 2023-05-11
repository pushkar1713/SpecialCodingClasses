package ppslab;

import java.util.Scanner;

public class program10 {
    public static void main(String[] args) {


        float[] marks = new float[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the marks of 5 subjects : ");
        float percentage;
        for(int i=0;i<5;i++){
            marks[i]=sc.nextFloat();
            percentage = marks[i];
            if (percentage<=100 && percentage>90)
                System.out.println("Grade A");
            else if (percentage<=90 && percentage>80)
                System.out.println("Grade B");
            else if (percentage<=80 && percentage>=60)
                System.out.println("Grade C");
            else
            System.out.println("Grade D");

        }
        sc.close();

    }
}
