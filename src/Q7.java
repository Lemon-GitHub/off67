/*
* 斐波那契数列
* */

public class Q7 {
    public int Fibonacci(int n) {
        if (n < 1) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        int last2 = 0;
        int last1 = 1;
        int cur = 0;

        for(int i = 2; i <= n; i++) {
            cur = last1 + last2;
            last2 = last1;
            last1 = cur;
        }
        return cur;
    }
}