/* 
Problem Name : 1213-B Bad Prices
Problem Link : https://codeforces.com/contest/1213/problem/B
My Approach :  Traverse from right to left, keep track of minimum value and count elements greater than it.
*/

import java.util.ArrayList;
import java.util.Scanner;
 
public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(sc.nextInt());
            }
            if (n == 1) {
                System.out.println("0");
            } else {
                int minEl = list.get(n - 1);
                int badDays = 0;
                for (int i = n - 2; i >= 0; i--) {
                    if (list.get(i) > minEl) {
                        badDays++;
                    } else {
                        minEl = list.get(i);
                    }
                }
                System.out.println(badDays);
            }
        }
    }
}
