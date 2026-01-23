/* 
Problem Name : 1165-B Polycarp Training
Problem Link : https://codeforces.com/contest/1165/problem/B

Approach: Store numbers with frequency and pick problems day by day in increasing order by using TreeMap.

*/

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
 
public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int todayProblems = 1;
        int count = 0;
 
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int freq = entry.getValue();
 
            while (freq > 0 && key >= todayProblems) {
                todayProblems++;
                count++;
                freq--;
            }
        }
        System.out.println(count);
    }
}
