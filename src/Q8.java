/*
* 跳台阶
* */

public class Q8 {
    public int JumpFloor(int target) {
        if (target == 0) {
            return 0;
        }
        //只有一级台阶 则有一种跳法
        if (target == 1) {
            return 1;
        }
        //两级台阶 有两种跳法
        if (target == 2) {
            return 2;
        }

        return JumpFloor(target - 1) + JumpFloor(target - 2);
    }
}
