package com.example.coding.힙;

import java.util.Arrays;
import java.util.PriorityQueue;

public class 디스크컨트롤러 {
  public static void main(String[] args) {
    Solution s = new Solution();
    int[][] a  = {{0, 3}, {1, 9}, {2, 6}};
    System.out.println("s.solution(a) = " + s.solution(a));
  }
  public static class Solution {
    public int solution(int[][] jobs) {
      int answer = 0;
      int time = 0;
      // 소요시간 우선순위 큐
      PriorityQueue<int[]> workQue = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);
      // 작업 요청 시점 우선순위 큐
      PriorityQueue<int[]> inQue = new PriorityQueue<>((o1, o2) -> o1[0] - o2[0]);
      for(int[] j : jobs) {
        inQue.offer(j);
      }
      
      for(int [] i : inQue) {
        for(int a : i ){
          System.out.println("a = " + a);
        }
      }
      while(!inQue.isEmpty() || !workQue.isEmpty()){
        // 현재 시간에 수행 가능한 작업을 모두 소요시간 우선순위 큐에 넣음
//        System.out.println("inQue.peek()[0] = " + inQue.peek()[0]);
        while(!inQue.isEmpty() && inQue.peek()[0] <= time){
          workQue.offer(inQue.poll());
        }

        if(workQue.isEmpty()){ // 소요시간 우선순위 큐가 비었다면 현재 시간에 수행 가능항 작업이 없다는 뜻이므로 현재 시간을 최소 요청시간으로 변경
          System.out.println("inQue.peek()[0] = " + inQue.peek()[0]);
          time = inQue.peek()[0];
          
        }else{ // 소요시간 우선순위 큐에서 작업시간이 가장 적은 것을 꺼내서 먼저 계산
          int[] j = workQue.poll();
          System.out.println("answer = " + answer);
          answer += time + j[1] - j[0];
          System.out.println("answer +\"=\"+answer+\"+\"+time+\"+\"+j[1]+\"-\"+j[0] = " + answer+"=+"+time+"+"+j[1]+"-"+j[0]);
          time += j[1];
          System.out.println("time = " + time);
        }
        // 다시 현재 시간을 기준으로 수행 가능한 작업을 소요시간 우선순위 큐에 넣음
      }

      answer /= jobs.length;
      return answer;
    }
  }
}
