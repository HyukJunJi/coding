package com.example.coding._2024.힙;

import java.util.PriorityQueue;

public class 더맵게 {
  public static void main(String[] args) {
    Solution s = new Solution();
    int [] a = {7,5,10};
    System.out.println(s.solution(a,12));
  }
  public static class Solution {
    public int solution(int[] scoville, int K) {
      int answer = 0;
      PriorityQueue<Integer> que = new PriorityQueue<>();

      for (int i = 0; i < scoville.length; i++) {
        que.add(scoville[i]);
      }
      while(que.peek() < K) {
        if (que.size() == 1)
          return -1;
        que.add(que.poll() + que.poll() * 2);
        answer++;
      }
      return answer;
    }
  }
}
