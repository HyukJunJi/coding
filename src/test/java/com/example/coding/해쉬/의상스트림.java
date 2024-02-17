package com.example.coding.해쉬;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.reducing;

import java.util.Arrays;

public class 의상스트림 {
  public static void main(String[] args) {
    Solution s = new Solution();
    String[][] a = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
    System.out.println(s.solution(a));
  }
  public static class Solution {
    public int solution(String[][] clothes) {
      long i = Arrays.stream(clothes)
          .collect(groupingBy(cloth -> cloth[1], mapping(cloth -> cloth[0], counting())))
          .values()
          .stream()
          .collect(reducing(1L, (x, y) -> x * (y + 1)));//.intValue() - 1;
      System.out.println("i = " + i);
      return 0;
    }
  }
}
