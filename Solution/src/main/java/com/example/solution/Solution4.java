package com.example.solution;

import java.util.Arrays;

public class Solution4 {
    public int maximumGap(int[] nums) {
        if (nums.length < 2) return 0;

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        // 找到数组中的最小值和最大值
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        if (max == min) return 0; // 所有元素相同

        int n = nums.length;
        int bucketSize = Math.max(1, (max - min) / (n - 1)); // 桶的大小
        int bucketCount = (max - min) / bucketSize + 1;

        int[] bucketMin = new int[bucketCount];
        int[] bucketMax = new int[bucketCount];
        Arrays.fill(bucketMin, Integer.MAX_VALUE);
        Arrays.fill(bucketMax, Integer.MIN_VALUE);

        // 将元素分配到桶中
        for (int num : nums) {
            int bucketIndex = (num - min) / bucketSize;
            bucketMin[bucketIndex] = Math.min(bucketMin[bucketIndex], num);
            bucketMax[bucketIndex] = Math.max(bucketMax[bucketIndex], num);
        }

        int maxGap = 0;
        int previousMax = min;

        // 计算相邻桶之间的最大差值
        for (int i = 0; i < bucketCount; i++) {
            if (bucketMin[i] == Integer.MAX_VALUE) continue; // 跳过空桶
            maxGap = Math.max(maxGap, bucketMin[i] - previousMax);
            previousMax = bucketMax[i];
        }

        return maxGap;
    }
}

//直接换了个算法
