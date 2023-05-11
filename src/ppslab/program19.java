package ppslab;


public class program19 {
    public static void main(String[] args) {
        int i;
        for (i = 1; i < 100; i++) {
            double d = counter(i);
            int p = i;
            double num = 0;
            double rem;
            while (p != 0) {
                rem = p % 10;
                num = num + Math.pow(rem,d);
                p= p / 10;
            }
            if(i==num)
                System.out.print(i + " ");
        }
    }
        public static int counter (int x){
            int c = 0;
            int rem = 0;
            while (x != 0) {
                rem = x % 10;
                c++;
                x = x / 10;
            }
            return c;

        }

}
