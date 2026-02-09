package com.example.coding._2024.재귀.순열;

import java.util.ArrayList;
import java.util.List;
//중복이 있고 순서가 있는건 1,1 가능하고 1,2와 2,1이 다름 순서가 있어서 다름
public class 중복O순서O {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4}; // 초기 배열
    int length = 3; // 조합의 길이

    generatePermutations(arr, length, new ArrayList<>());
  }

  private static void generatePermutations(int[] arr, int length, List<Integer> tempList) {
    System.out.println("Con");
    // 조합의 길이가 목표에 도달하면 출력
    if (tempList.size() == length) {
      System.out.println(tempList);
      System.out.println("MY");
      return;
    }
    for (int i = 0; i < arr.length; i++) { // 시작 위치 변경 없이 모든 위치에서 시작
      // 현재 원소 추가
      System.out.println(i);
      tempList.add(arr[i]);
      System.out.println(">>>"+tempList);
      // 다음 원소를 위해 재귀 호출 (중복 허용)
      generatePermutations(arr, length, tempList);
      // 마지막 원소 제거 후 다른 조합 시도
      System.out.println(">>"+tempList);
      tempList.remove(tempList.size() - 1);

      System.out.println(">->"+tempList);
    }
  }
}
