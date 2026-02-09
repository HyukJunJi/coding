package com.example.coding._2024.재귀.순열;

import java.util.ArrayList;
import java.util.List;
//중복이 없고 순서가 없는건 2,1과 1,2를 같음
public class 중복X순서X {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3}; // 초기 배열
    int length = 2; // 조합의 길이

    generateCombinations(arr, length, 0, new ArrayList<>());
  }

  public static void generateCombinations(int[] arr, int length, int startPosition, List<Integer> tempList) {
    System.out.println("Con");
    if (tempList.size() == length) {
      System.out.println(tempList);
      System.out.println("MY");
      return;
    }

    for (int i = startPosition; i < arr.length; i++) {
      System.out.println(i);
      tempList.add(arr[i]);
      // 순서가 없으므로, 같은 수를 다시 선택하지 않도록 합니다.
      System.out.println(">>"+tempList);
      generateCombinations(arr, length, i + 1, tempList);
      System.out.println(">->"+tempList);
      tempList.remove(tempList.size() - 1);
      System.out.println("><"+tempList);
    }
  }
}
