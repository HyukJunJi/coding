package com.example.coding.스택큐;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class 주식가격 {
  public static void main(String[] args) {
    Solution s = new Solution();
    int [] pr = {4, 5, 1, 2, 6, 1, 1};
    System.out.println(Arrays.toString(s.solution(pr)));
  }
  public static class Solution {
    public int[] solution(int[] prices) {
      int[] answer = {};
      Queue<Integer> queue = new LinkedList<>();
      int cnt=0;

      for(int i = 0 ; i < prices.length;i++) {
        for(int j = 1+i ; j< prices.length;j++) {
          if(prices[i]<=prices[j]) {
            cnt++;
          }
          if(prices[i]>prices[j]) {
            cnt++;
            break;
          }
        }
        queue.add(cnt);
        cnt=0;

      }
      return queue.stream().mapToInt(Integer::intValue).toArray();
    }
  }
}
