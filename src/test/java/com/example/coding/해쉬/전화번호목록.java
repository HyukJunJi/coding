package com.example.coding.해쉬;

import java.util.Arrays;
import java.util.HashMap;

public class 전화번호목록 {
  public static void main(String[] args) {
    Solution s = new Solution();
    String[] a = {"12","123","1235","567","88"};
    System.out.println(s.solution(a));
  }
  public static class Solution {
    public boolean solution(String[] phone_book) {

      HashMap<String,Integer> hashMap = new HashMap<>();
      for (int i = 0; i < phone_book.length; i++) {
        hashMap.put(phone_book[i], i);
      }
      for(int i = 0 ; i  < phone_book.length;i++) {
        for(int j = 0 ; j <phone_book[i].length();j++) {
          if(hashMap.containsKey(phone_book[i].substring(0,j)))
            return false;
        }
      }
      return true;
    }
  }
}
