package com.example.coding.재귀.순열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//중복이 없고 순서가 있는건 2,1과 1,2를 다름
public class 중복X순서O {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3}; // 초기 배열
    generatePermutations(arr,2, new boolean[arr.length], new ArrayList<>());
  }

  public static void generatePermutations(int[] arr,int length, boolean[] used, List<Integer> permutation) {
    if (permutation.size() == length) {
      System.out.println(permutation);
      return;
    }

    for (int i = 0; i < arr.length; i++) {
      if (!used[i]) { // 아직 사용되지 않은 요소만 선택
        used[i] = true; // 요소를 사용한 것으로 표시
        permutation.add(arr[i]); // 순열에 요소 추가
        generatePermutations(arr, length, used, permutation); // 재귀 호출
        // 백트래킹: 다음 순열을 위해 마지막 요소 제거 및 사용 표시 해제
        used[i] = false;
        permutation.remove(permutation.size() - 1);
      }
    }
  }
}
