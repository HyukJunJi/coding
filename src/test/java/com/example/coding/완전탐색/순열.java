package com.example.coding.완전탐색;

public class 순열 {
  public static void main(String[] args) {
    int []num = {1,2,3,4,5};
    int count = countCombinations(num, 0, 3);
    System.out.println("세 개의 숫자 조합의 개수: " + count);
  }
  public static int countCombinations(int[] num, int start, int remaining) {
    if (remaining == 0) {
      return 1;
    }

    if (start >= num.length) {
      return 0;
    }

    // 현재 숫자를 선택하는 경우와 선택하지 않는 경우를 모두 고려
    int includeCurrent = countCombinations(num, start + 1, remaining - 1);
    int excludeCurrent = countCombinations(num, start + 1, remaining);

    return includeCurrent + excludeCurrent;
  }
}
