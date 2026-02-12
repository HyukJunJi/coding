package com.example.coding._2026.LeetCode;

import java.util.HashMap;

public class Valid_Anagram {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (char d : s.toCharArray()) {
            if (map.containsKey(d)) {
                map.put(d, map.get(d) + 1);
            } else {
                map.put(d, 1);
            }
        }
        for (char d : t.toCharArray()) {
            if (map2.containsKey(d)) {
                map2.put(d, map2.get(d) + 1);
            } else {
                map2.put(d, 1);
            }
        }
        if (map.size() != map2.size()) return false;

        for (Character key : map.keySet()) {
            if (!map2.containsKey(key) || !map.get(key).equals(map2.get(key))) {
                return false;
            }
        }
        return true;
    }

    public boolean isAnagram2(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char d : s.toCharArray()) {
            if (map.containsKey(d)) {
                map.put(d, map.get(d)+1);
            } else {
                map.put(d, 1);
            }
        }

        for (char d : t.toCharArray()) {
            if (map.containsKey(d)) {
                map.put(d, map.get(d)-1);
            } else {
                return false;
            }
        }

        for (int value : map.values()) {
            if (value != 0) return false;
        }
        return true;
    }

    public boolean isAnagram3(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) - 1);
        }

        for (int value : map.values()) {
            if (value != 0) return false;
        }

        return true;

    }

    public boolean isAnagram4(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] arr = new int[26];

        for(char c : s.toCharArray()){
            arr[c-'a']++;
        }
        for(char c : t.toCharArray()){
            if(arr[c-'a'] == 0) return false;
            arr[c-'a']--;
        }
        return true;
    }
}
