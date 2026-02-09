package com.example.coding._2024.프로그래머스;

import java.util.ArrayList;
import java.util.List;

public class sol {
  public static void main(String[] args) {
    Solution s = new Solution();
    int solution = s.solution(2, 4, 17);
    System.out.println(solution);
  }
  public static class Solution {
    public int solution(int n, long l, long r) {
      int tmpn=n;
      int[] narr = new int[n];
      List<String> arr = new ArrayList<>();
      arr.add("1");

      for (int i = n; i > 0; i--) {
        narr[i - 1] = n;
        n = n - 1;
      }
      for (int i = 0; i < narr.length; i++) {
        String str = "";
        for (int j = 0; j < (int) Math.pow(5, narr[i] - 1); j++) {

          if (arr.get(i).charAt(j) == '0') {
            str = str + "00000";
          } else {
            str = str + "11011";
          }
        }
        arr.add(str);
      }
      String sub = arr.get(tmpn).substring((int) l - 1, (int) r);
      int countOfOnes = (int) sub.chars().filter(ch -> ch == '1').count();

      return countOfOnes;
    }
  }
}
