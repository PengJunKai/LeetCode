package climbStairs;

/**
 * Created by PengJK on 2018/8/7.
 * 假设你正在爬楼梯。需要 n 步你才能到达楼顶。
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * 注意：给定 n 是一个正整数。
 * You are climbing a stair case. It takes n steps to reach to the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * Note: Given n will be a positive integer.
 */
public class Solution {

    public int climbStairs(int n) {
        int result = 0;
        //一阶
        if(n==1) {
            result = 1;
        } else if(n==2) { //二阶
            result = 2;
        } else if(n>2) {
            int[] ways = new int[n];
            ways[0] = 1;
            ways[1] = 2;

            for( int i = 2;i<n;i++) {
                /*
                * 到达n的“前一步”走法可以是：从n-1处爬1阶楼梯，或者从n-2处爬2阶楼梯。
                * 设S(n)表示走n级台阶的走法数量。走n级台阶，第一步只有两种选择：可以选择走1阶，然后还有S(n-1)种走法；选择走2阶，那么接下来有S(n-2)种走法。那么S(n) = S(n-1) + S(n-2)。
                * 斐波那契数列,理解这儿就能理解这道题了
                */
                ways[i] = ways[i-1] + ways[i-2];
            }

            result = ways[n-1];
        }
        return result;
    }

}
