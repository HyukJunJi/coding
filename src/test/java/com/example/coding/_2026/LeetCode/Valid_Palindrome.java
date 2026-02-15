package com.example.coding._2026.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Valid_Palindrome {
    public void main(String[] args) {
        isPalindrome("`l;`` 1o1 ??;l`");
    }

    public boolean isPalindrome(String s) {
        int i = 0;
        List<Character> a = new ArrayList<>();
        s = s.toLowerCase();
        for(char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                a.add(c) ;
            }
            i++;
        }
        i = 0;
        for(i = 0 ; i < a.size() ; i++) {
            if (a.get(i) != a.get(a.size() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindrome2(String s) {
        if (s.isEmpty()) {
            return true;
        }
        int start = 0;
        int last = s.length() - 1;
        while(start <= last) {
            char currFirst = s.charAt(start);
            char currLast = s.charAt(last);
            if (!Character.isLetterOrDigit(currFirst )) {
                start++;
            } else if(!Character.isLetterOrDigit(currLast)) {
                last--;
            } else {
                if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
                    return false;
                }
                start++;
                last--;
            }
        }
        return true;
    }
}
