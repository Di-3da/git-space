package com.example.solution;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

/**
 * L学号_X_Test.java
 *
 * 测试用例设计原则：
 * - 等价类划分原则：将输入分为有效和无效等价类，以确保覆盖各种输入情况。
 * - 边界值分析原则：测试数组长度为2、最大最小值相同等特殊情况。
 */
public class L2022211832_4_Test {

    private final Solution4 solution = new Solution4();

    /**
     * 测试目的：验证正常情况下数组的最大差值
     * 用到的测试用例：nums = [3, 6, 9, 1]
     */
    @Test
    public void testMaximumGapNormal() {
        int[] nums = {3, 6, 9, 1};
        assertEquals(3, solution.maximumGap(nums));
    }

    /**
     * 测试目的：验证数组元素个数小于2的情况
     * 用到的测试用例：nums = [10]
     */
    @Test
    public void testMaximumGapLessThanTwo() {
        int[] nums = {10};
        assertEquals(0, solution.maximumGap(nums));
    }

    /**
     * 测试目的：验证所有元素相同的情况
     * 用到的测试用例：nums = [5, 5, 5, 5]
     */
    @Test
    public void testMaximumGapAllSame() {
        int[] nums = {5, 5, 5, 5};
        assertEquals(0, solution.maximumGap(nums));
    }

    /**
     * 测试目的：验证大数组的最大差值
     * 用到的测试用例：nums = [1, 1000000000, 500000000]
     */
    @Test
    public void testMaximumGapLargeArray() {
        int[] nums = {1, 1000000000, 500000000};
        assertEquals(500000000, solution.maximumGap(nums)); // 修改预期值为500000000
    }


    /**
     * 测试目的：验证逆序数组的情况
     * 用到的测试用例：nums = [9, 6, 3, 1]
     */
    @Test
    public void testMaximumGapDescending() {
        int[] nums = {9, 6, 3, 1};
        assertEquals(3, solution.maximumGap(nums));
    }
}

//很好的测试，使我内心旋转
