/*
Problem Name : 1760-C Advantage
Problem Link : https://codeforces.com/contest/1760/problem/C

My Approach : First, I read the array and find the maximum and second maximum elements in a single loop.
Then, for each element, if it is not the maximum, I subtract the maximum from it.
If the element is the maximum, I subtract the second maximum instead.
Finally, I print the result array for each test case.

*/
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(); // length of array;
            int[] arr = new int[n];
            int maxNo = Integer.MIN_VALUE;
            int secondMax = maxNo;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] > maxNo || arr[i] == maxNo) {
                    secondMax = maxNo;
                    maxNo = arr[i];
                } else if (arr[i] > secondMax && arr[i] != maxNo) {
                    secondMax = arr[i];
                }
            }
            int[] ans = new int[n];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < maxNo) {
                    ans[i] = arr[i] - maxNo;
                    System.out.print(ans[i] + " ");
                } else if (arr[i] == maxNo) {
                    ans[i] = maxNo - secondMax;
                    System.out.print(ans[i] + " ");
                }
            }
            System.out.println();
        }
    }
}
  
