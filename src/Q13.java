/*
 * 调整数组顺序使奇数位于偶数之前
 * */

import java.util.*;
public class Q13 {
    public static void reOrderArray(int [] array) {

        if (array.length <= 1) {
            return;
        }
        Queue<Integer> odd = new LinkedList<>();
        Queue<Integer> even = new LinkedList<>();

        int temp;
        for (int i = 0; i < array.length; i++) {
            temp = array[i];
            if (temp % 2 == 1) {
                odd.offer(temp);
            } else {
                even.offer(temp);
            }
        }
        int index = 0;
        while (!odd.isEmpty()) {
            array[index] = odd.poll();
            index++;
        }
        while (!even.isEmpty()) {
            array[index] = even.poll();
            index++;
        }
    }
}
