package main;

public class Problem_005 {
    public static void main(String[] args) {
        int n = 1;
        
        for (int i = 2; i <= 20; i++) {
            n = LCM(n, i);
            System.out.println(i + "  " + n);
        }
        
        System.out.println("The smallest positive number that is evenly divisible by all of the numbers from 1 to 20 is: " + n);
    }
    
    public static int LCM(int a, int b) {
        if (a % b == 0) {
            return a;
        }
        
        if (b % a == 0) {
            return b;
        }
        
        int P = a * b;
        while (a != b) {
            if (a > b) {
                a = a - b;
            }
            
            if (a < b) {
                b = b - a;
            }
        }
        
        return P / a;
    }
}
