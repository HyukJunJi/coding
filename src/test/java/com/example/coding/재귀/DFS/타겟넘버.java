package com.example.coding.재귀.DFS;

public class 타겟넘버 {
  public static void main(String[] args) {
    Solution s = new Solution();
    int [] num = {4,1,2,1};
    int target =4;
    int solution = s.solution(num, target);
    System.out.println("solution = " + solution);
  }
  public static class Solution {
    int answer;
    public int solution(int[] numbers, int target) {
      answer = 0;
      dfs(0,0,numbers,target);
      return answer;
    }
    public void dfs(int n,int sum , int[]numbers,int target) {
      if(n==numbers.length) {
        if(sum == target) {
          answer++;
        }
          return;

      }
      dfs(n+1, sum+numbers[n],numbers,target);
      dfs(n+1, sum-numbers[n],numbers,target);
    }
  }

}
