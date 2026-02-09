package com.example.coding._2026.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    //내정답
    public int[] twoSum(int[] nums, int target) {
        int a = 0;
        int tmp = 0;
        int b = 1;
        int [] result = new int[2];

        for(int i = a ; i < nums.length ; i++) {
            for(int j = b ; j < nums.length ; j++) {
                tmp = nums[i] + nums[j];
                if (tmp == target) {
                    result[0] = i;
                    result[1] = j;
                    break ;
                }
            }
            a++;
            b++;
        }
        return result;
    }
    //가장빠른정답
    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];

            if (map.containsKey(need)) {
                return new int[]{map.get(need), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }
}
