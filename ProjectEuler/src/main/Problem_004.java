package main;

public class Problem_004 {
    
    public static void main(String[] args) {
        int max = 100;
        for (int i = 999; i >= 100; i--) {
            for (int j = i; j >= 100; j--) {
                int tmp = i * j;
                if (isPalindrome(tmp)) {
                    if (max < tmp) {
                        max = tmp;
                        System.out.println(i + " " + j);
                    }
                    break;
                }
            }
        }
        System.out.println("The largest palindrome made from the product of two 3-digit numbers: " + max);
    }
    
    public static boolean isPalindrome(int n) {
        int max = 0;
        int i = n;
        while (n != 0) {
            max = (max * 10) + n % 10;
            n = n / 10;
        }
        
        if (max == i) {
            return true;
        }
        return false;
    }
}
