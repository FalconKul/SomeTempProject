package main;

public class Problem_003 {
    
    public static void main(String[] args) {
        double n = 600851475143.0;
        for (int i = 2; i <= n; i++) {
            while(n % i == 0) {
                System.out.println(i);
                n /= i;
            }
        }
    }
}
