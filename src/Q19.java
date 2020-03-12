/*
 * 顺时针打印矩阵
 * */

import java.util.ArrayList;

public class Q19 {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> arr = new ArrayList<>();
        int flag = 1; // 1-right  2-down 3-left 4-up
        int x = 0;
        int y = 0;
        // vis数组标记已经走过的点
        boolean[][] vis = new boolean[matrix.length][matrix[0].length];
        while (arr.size() < matrix.length * matrix[0].length) {
            // 判断是否越界  （已经走过的点再次遍历也视为越界
            if (x < 0 || x >= matrix.length || y < 0 || y >= matrix[0].length || vis[x][y]) {
                if (flag == 1) {
                    flag = 2; // down
                    y--; // 消除越界
                    x++; // 到达下一个位置的横坐标
                } else if (flag == 2) {
                    flag = 3; // left
                    x--;
                    y--;
                } else if (flag == 3) {
                    flag = 4; // up
                    y++;
                    x--;
                } else {
                    flag = 1; // right
                    x++;
                    y++;
                }
            } else {
                arr.add(matrix[x][y]);
                vis[x][y] = true;
                // 更新下一个要访问的点
                if (flag == 1) {
                    y++;
                } else if (flag == 2) {
                    x++;
                } else if (flag == 3) {
                    y--;
                } else {
                    x--;
                }
            }
        }
        return arr;
    }
}
