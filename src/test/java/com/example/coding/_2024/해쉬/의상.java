package com.example.coding._2024.해쉬;

import java.util.HashMap;
import java.util.HashSet;

public class 의상 {
  public static void main(String[] args) {
    Solution s = new Solution();
    String[][] a = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
    System.out.println(s.solution(a));
  }
  public static class Solution {
    public int solution(String[][] clothes) {
      int answer = 1;

      HashSet<String> type = new HashSet<>();
      HashMap<String, Integer> cnt = new HashMap<>();
      HashMap<String, String> hashMap = new HashMap<>();
      for(int i = 0 ; i < clothes.length;i++) {
        hashMap.put(clothes[i][0],clothes[i][1]);
        type.add(clothes[i][1]);
      }

      for(String t: type ) {
        cnt.put(t,0);
      }
      for(int i = 0 ; i < clothes.length;i++) {
        for(String t:type) {
          if(hashMap.get(clothes[i][0]).equals(t)) {
            cnt.replace(t,cnt.get(t)+1);
          }
        }
      }
      for(String t:type) {
        answer = answer * (cnt.get(t)+1);
      }

      return answer-1;
    }
  }
}
