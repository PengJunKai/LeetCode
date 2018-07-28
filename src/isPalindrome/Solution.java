package isPalindrome;

import static java.lang.StrictMath.pow;

/**
 * Created by PengJK on 2018/7/28.
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
 */
public class Solution {

    public boolean isPalindrome(int x) {
        if(x<0) {
            return false;
        }

        int bit = 0;
        while(x/(int)pow(10,bit) !=0 ) {
            bit++;
            //java in最长是10位,如果不跳出,强转会出现其他结果,测试用例2147483647 会进入死循环
            if(bit == 10) {
                break;
            }
        }

        while(bit>1) {
            //比较头尾
            if(x%10 != (x/(int)pow(10,bit-1))) {
                return false;
            }
            //去头尾
            x = x%(int)pow(10,bit-1)/10;
            bit -= 2;
        }

        return true;
    }
}
