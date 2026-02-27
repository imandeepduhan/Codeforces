/*
Problem Name : 365-A Good Number.
Problem Link : https://codeforces.com/contest/365/problem/A
My Approach : For each number, I convert it into digits and sort them. Then I check if the digits from 0 to k are present in the number.
If all digits from 0 to k exist at least once, I count it as a good number.
*/

import java.util.Arrays;
import java.util.Scanner;

public class GoodNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            String str = sc.next();
            int num = str.charAt(0) - '0';
            if (num == 0) {
                continue;
            }

            int[] arr = new int[str.length()];
            for (int j = 0; j < str.length(); j++)
                arr[j] = str.charAt(j) - '0';

            Arrays.sort(arr);
            int count = 0;
            int prev = -1;
            if (count != arr[0]) {
                continue;
            } else {
                prev = arr[0];
                count++;
            }
            int idx = 1;
            boolean ok = true;
            while (idx < str.length() && count <= k) {
                if (arr[idx] == count) {
                    prev = arr[idx];
                    if (idx == str.length() - 1) {
                        break;
                    }
                    count++;
                } else if (arr[idx] == prev) {
                    prev = arr[idx];
                } else {
                    ok = false;
                    break;
                }
                idx++;
            }
            if (count >= k && ok) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
