/*
 * 旋转数组的最小数字
 * */

public class Q6 {
    public int minNumberInRotateArray(int [] array) {
        if(array.length == 0) {
            return 0;
        }
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            if (array[left] < array[right]) {
                return array[left];
            }
            int mid = left + (right - left) / 2;
            // 左边为有序数组
            if (array[left] < array[mid]) {
                left = mid + 1;
            }
            // 右边是有序数组
            else if (array[right] > array[mid]) {
                right = mid;
            }  else{ //缩小范围
                left++;
            }
        }
        return array[left];
    }
}
