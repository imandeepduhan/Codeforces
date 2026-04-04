/*
Problem Name : 451-A Game With Sticks
Problem Link : https://codeforces.com/contest/451/problem/A

My Appraoch : First, I take input n and m. Then I create two variables f and l. I set f = n and l = m - 1. I also calculate total = n * m.
Then I run a while loop until total becomes zero. Inside the loop, I subtract (f + l) from total. I decrease f and l step by step.
I also change the turn after each move.
Finally, if turn is true, I print Akshat, otherwise I print Malvika.

*/

import java.util.Scanner;
 
public class GameWithSticks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int total = n * m;
        int f = n;
        int l = m - 1;
        boolean turn = true;
        while (total != 0) {
            int a = f + l;
            total -= a;
            if (f > 0) {
                f--;
            }
            if (l > 0) {
                l--;
            }
            if (turn && total != 0) {
                turn = false;
            } else if (!turn && total != 0) {
                turn = true;
            }
        }
        if (turn) {
            System.out.println("Akshat");
        } else {
            System.out.println("Malvika");
        }
    }
}
