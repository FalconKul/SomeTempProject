package main;

import java.util.LinkedList;
import java.util.Queue;

public class Prolblem_008 {
    static Queue<Integer> m_list = new LinkedList<>();
    
    public static void main(String[] args) {
        int add, remove, indexOfZero = 0;
        long max, tmp;
        
        String text = "73167176531330624919225119674426574742355349194934" + "96983520312774506326239578318016984801869478851843"
                + "85861560789112949495459501737958331952853208805511" + "12540698747158523863050715693290963295227443043557"
                + "66896648950445244523161731856403098711121722383113" + "62229893423380308135336276614282806444486645238749"
                + "30358907296290491560440772390713810515859307960866" + "70172427121883998797908792274921901699720888093776"
                + "65727333001053367881220235421809751254540594752243" + "52584907711670556013604839586446706324415722155397"
                + "53697817977846174064955149290862569321978468622482" + "83972241375657056057490261407972968652414535100474"
                + "82166370484403199890008895243450658541227588666881" + "16427171479924442928230863465674813919123162824586"
                + "17866458359124566529476545682848912883142607690042" + "24219022671055626321111109370544217506941658960408"
                + "07198403850962455444362981230987879927244284909188" + "84580156166097919133875499200524063689912560717606"
                + "05886116467109405077541002256983155200055935729725" + "71636269561882670428252483600823257530420752963450";
        
        // add 13 first elements to the m_list
        for (int i = 0; i < 13; i++) {
            m_list.add(Integer.parseInt(String.valueOf(text.charAt(i))));
        }
        max = multiList();
        
        // Find the answer of the question
        for (int i = 13; i < text.length() - 13; i++) {
            // show the next value will add to m_list
            add = Integer.parseInt(String.valueOf(text.charAt(i)));
            
            // continue add value to m_list if m_list have value zero
            if (indexOfZero >= i) {
                System.out.println("Zero index = " + indexOfZero + ", index = " + i);
                m_list.add(add);
                System.out.println(add + " ");
                m_list.remove();
                continue;
            }
            
            if (add == 0) {
                indexOfZero = i + 13;
                System.out.println("Add value 0, Zero index = " + indexOfZero);
                m_list.add(add);
                System.out.println("Add0 " + add);
                m_list.remove();
                continue;
            }
            
            m_list.add(add);
            System.out.println("\nAdd: " + add);
            remove = m_list.remove();
            System.out.println("Remove: " + remove);
            
            if (add <= remove) {
                System.out.println("continues");
                continue;
            }
            
            // find multiple list
            tmp = multiList();
            System.out.println("Multiple list now is: " + tmp);
            
            // if tmp large than max, max = tmp
            if (max < tmp) {
                max = tmp;
                System.out.println("Max now is: " + max);
            }
        }
        
        // You can check console log for more information  
        System.out.println("The answer is: " + max);
    }
    
    public static long multiList() {
        long tmp = 1;
        for (Integer integer : m_list) {
            tmp *= integer;
        }
        return tmp;
    }
}
