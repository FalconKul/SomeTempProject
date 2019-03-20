package main;

public class Problem_006 {
    
    public static void main(String[] args) {
        
        int diffSum = 0;
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= 100; j++) {
                if (i != j) {
                    // we run 2 time i*j so we don't need to *2
                    diffSum += i * j;
                }
            }
        }
        System.out.println("Answer is: " + diffSum);
    }
}
