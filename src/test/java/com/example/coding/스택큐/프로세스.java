package com.example.coding.스택큐;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import org.json.JSONObject;

public class 프로세스 {
  public static void main(String[] args) {
    Solution s = new Solution();
    int [] arr = {1, 1, 9, 1, 1, 1};
    int l = 0;
    System.out.println(s.solution(arr, l));
  }
  // 2 3 4 5 0 1
  public static class Solution {
    public int solution(int[] priorities, int location) {
      PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
      int answer = 0;

      for (int i : priorities) {
        queue.offer(i);
      }
     //[9,1,1,1,1,1]
      while (!queue.isEmpty()) {
        // 기존 우선순위 배열 순회
        for (int i = 0; i < priorities.length; i++) {
          // 현재 작업의 위치 찾기

          if (queue.peek() == priorities[i]) {
            System.out.println("queue = " + queue.peek());
            System.out.println("i = " + i);
            queue.poll();
            answer++;
            System.out.println("location = " + location);
            System.out.println("answer = " + answer);
            // 현재 작업이 location과 같으면 answer 반환
            if (location == i) {
              return answer;
            }
          }
        }
      }

      출처: https://ittrue.tistory.com/528 [IT is True:티스토리]
      return answer;
    }
  }
}
