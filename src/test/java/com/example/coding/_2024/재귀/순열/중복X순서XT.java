package com.example.coding._2024.재귀.순열;

import java.util.ArrayList;
import java.util.List;

//중복이 없고 순서가 없는건 2,1과 1,2를 같음
public class 중복X순서XT {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3}; // 초기 배열
    int length = 2; // 조합의 길이

    generateCombinations(arr, length, 0, new ArrayList<>());
  }

  public static void generateCombinations(int[] arr, int length, int startPosition, List<Integer> tempList) {
    if(tempList.size()==length) {
      System.out.println(tempList);
      return;
    }
    for(int i = startPosition ; i < arr.length;i++) {
      tempList.add(arr[i]);

      generateCombinations(arr,length,i+1,tempList);

      tempList.remove(tempList.size()-1);
    }
  }
}
