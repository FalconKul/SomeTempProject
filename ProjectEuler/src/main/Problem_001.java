package main;

public class Problem_001 {
    
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 3; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.print(i + " ");
                sum += i;
            }
        }
        System.out.println("\nSum all the natural numbers below 1000 that are multiples of 3 or 5 is: " + sum);
    }
    
}
