/*
 * 数值的整数次方
 * */

public class Q12 {
    public double Power(double base, int exponent) {
        double ret = 1.0;
        if(base == 0 && exponent == 0) {
            return 0;
        }
        if(exponent > 0){
            for(int i = 0; i < exponent; i++) {
                ret *= base;
            }
        }
        if(exponent < 0){
            for(int i = 0; i > exponent; i--) {
                ret /= base;
            }
        }
        return ret;
    }
}
