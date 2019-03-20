package main;

public class Problem_007 {
    
    public static void main(String[] args) {
        
        int prime[] = new int[10001];
        int index = 2;
        prime[0] = 2;
        prime[1] = 3;
        prime[2] = 5;
        
        int n = 2;
        int j;
        // Find the prime number
        while (index < 10001) {
            n++;
            for (j=0; j < index; j++) {
                if (n % prime[j] == 0) {
                    break;
                }
            }
            if (j == index) {
                prime[index] = n;
                index++;
                System.out.println(n);
            }
        }
        
         System.out.println("The 10 001st prime number is: " + prime[10000]);
        
    }
}
