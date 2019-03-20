package main;

public class Problem_002 {
    public static void main(String[] args) {
        double[] fipo = new double[100];
        fipo[0] = 1;
        fipo[1] = 1;
        
        for (int i = 2; i < fipo.length; i++) {
            double n = fipo[i - 1] + fipo[i - 2];
            fipo[i] = n;
        }
        double sum = 0;
        for (int i = 0; i < fipo.length; i++) {
            if (fipo[i] < 4000000 && fipo[i] % 2 != 0) {
                sum += fipo[i];
            }
        }
        System.out.println(sum);
        
        // Other way
        double f1 = 0;
        double f2 = 1;
        double fn = 0;
        double sum2 = 0; // sum2=0 because the first number in problem is 1 and 2
        
        while (fn <= 4000000) {
            fn = f1 + f2;
            f1 = f2;
            f2 = fn;
            if (fn % 2 == 0) {
                sum2 += fn;
            }
            System.out.println(fn + " " + sum2);
        }
        if (fn > 4000000 && sum2 > fn) {
            sum2 = sum2 - fn;
        }
        System.out.printf("Answer is : %.0f ", sum2);
    }
}
