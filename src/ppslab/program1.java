package ppslab;

import java.util.Scanner;

public class program1 {
    public static void main(String[] args) {


        float[] marks = new float[5];
        float sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the marks of 5 subjects : ");
        for(int i=0;i<5;i++){
            marks[i]=sc.nextFloat();
            sum = sum+marks[i];

        }
        float percentage;
        percentage= ((sum/500)*100);

        System.out.println("The marks is :" + sum );
        System.out.println("The percentage marks is :" + percentage);
        sc.close();

    }
}
