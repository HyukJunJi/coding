package com.example.coding._2024.재귀.순열;

import java.util.ArrayList;
import java.util.List;
//중복이 있고 순서가 없는건 1,1 가능하고 1,2와 2,1이 같음
public class 중복O순서X {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3}; // 초기 배열
    int length = 2; // 조합의 길이
    generateCombinations(arr, length, 0, new ArrayList<>());
  }

  public static void generateCombinations(int[] arr, int length, int startPosition, List<Integer> current) {
    if (current.size() == length) {
      System.out.println(current);
      return;
    }

    for (int i = startPosition; i < arr.length; i++) {
      current.add(arr[i]);
      // 다음 원소를 위해 재귀 호출 (i부터 시작하여 중복 허용)
      generateCombinations(arr, length, i, current);
      // 마지막 원소를 제거하고 다음 조합 시도
      current.remove(current.size() - 1);
    }
  }

}
