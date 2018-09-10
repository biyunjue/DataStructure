package com.yunfy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 最大子列和问题
 * <p>
 * 给定K个整数组成的序列{{ N1, N2, ..., NK}，，“连续子列”被定义为{ i, Ni+1, ..., Nj}，其中 1≤i≤j≤K。“最大子列和”则被定义为所有连续子列元素的和中最大者。例如给定序列{ -2, 11, -4, 13, -5, -2 }，其连续子列{ 11, -4, 13 }有最大的和20。现要求你编写程序，计算给定整数序列的最大子列和。
 * 输入格式:
 * 输入第1行给出正整数K (≤100000)；第2行给出K个整数，其间以空格分隔。
 * 输出格式:
 * 在一行中输出最大子列和。如果序列中所有整数皆为负数，则输出0。
 * 输入样例:
 * 6
 * -2 11 -4 13 -5 -2
 * 输出样例:
 * 20
 *
 * @author hj
 * @create 2018-09-07 10:02
 **/
public class MaxSubsequenceSum {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String kStr = null;
        String inputNumStr = null;
        try {
            kStr = reader.readLine();
            inputNumStr = reader.readLine();
            int k = Integer.valueOf(kStr);

            String[] nums = inputNumStr.split(" ");
            int tempCount = 0;
            int maxCount = 0;
            for (int i = 0; i < nums.length; i++) {
                int num = Integer.parseInt(nums[i]);
                tempCount += num;
                if (tempCount > maxCount) {
                    maxCount = tempCount;
                }
                if (tempCount <= 0) {
                    tempCount = 0;
                }
            }
            System.out.println(maxCount);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
