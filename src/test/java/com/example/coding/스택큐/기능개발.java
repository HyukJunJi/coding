package com.example.coding.스택큐;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class 기능개발 {
  public static void main(String[] args) {
    Solution s = new Solution();
    int[] progresses={95, 90, 99, 99, 80, 99};
    int[] speeds = {1, 1, 1, 1, 1, 1};
    System.out.println(s.solution(progresses, speeds));
  }
  public static class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
      int[] answer = {};

      Queue<Integer> queue = new LinkedList<>();
      int[] num = new int[progresses.length];
      for(int i = 0 ; i < progresses.length;i++) {
        int day = 100 - progresses[i];
        if(day % speeds[i]==0) {
          num[i] = day/speeds[i];
        } else {
          num[i] = day/speeds[i]+1;
        }
      }
      int max = num[0];
      int cnt = 1;
      for(int i = 1 ; i <progresses.length;i++) {
        if(max >= num[i]) {
          cnt+=1;
        } else {
          queue.add(cnt);
          cnt = 1;
          max = num[i];
        }
      }
      queue.add(cnt);
      answer = queue.stream().mapToInt(Integer::intValue).toArray();
      return answer;
    }
  }
}
