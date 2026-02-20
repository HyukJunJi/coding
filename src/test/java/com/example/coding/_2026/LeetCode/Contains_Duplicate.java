package com.example.coding._2026.LeetCode;

import java.util.HashMap;
import java.util.HashSet;

public class Contains_Duplicate {
    static void main() {
        containsDuplicate2(new int[]{3, 3});
    }

    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0 ; i < nums.length ; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i])+1);
            } else {
                map.put(nums[i], 1);
            }
        }
        boolean a = false;
        for(Integer d : map.values()) {
            if (d >= 2) {
                a = true;
            }
        }
        return a;
    }

    public static boolean containsDuplicate2(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0 ; i < nums.length ; i++) {
            if (!set.add(nums[i])) {
                return true;
            }
        }
        return false;
    }
}
