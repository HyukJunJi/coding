package com.example.coding.해쉬;

import java.util.Arrays;
import java.util.HashMap;

public class 완주하지못한선수 {
  public static void main(String[] args) {
    Solution s =new Solution();
    String [] a = {"mislav", "stanko", "mislav", "ana"};
    String [] b = {"stanko", "ana", "mislav"};
    System.out.println(s.solution(a,b));
  }
  public static class Solution {
    public String solution(String[] participant, String[] completion) {
      String answer = "";

      HashMap<String, Integer> finishers = new HashMap<>();

      for(String c:completion) {
        if(!finishers.containsKey(c)) {
          finishers.put(c, 1);
        } else {
          finishers.replace(c, finishers.get(c) + 1);
        }
      }

      for(String p: participant) {
        if(finishers.containsKey(p) && finishers.get(p) !=0) {
          finishers.replace(p, finishers.get(p) -1);
        } else{
          answer = p;
          break;
        }
      }

      return answer;
    }
  }
}
