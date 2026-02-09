package com.example.coding._2024.재귀.순열;

import java.util.ArrayList;
import java.util.List;

//중복이 있고 순서가 있는건 1,1 가능하고 1,2와 2,1이 다름 순서가 있어서 다름
public class 중복O순서OT {
  public static void main(String[] args) {
    int[] arr = {2, 3, 6, 7}; // 초기 배열
    int length = 2; // 조합의 길이

    generatePermutations(arr, length, new ArrayList<>());
  }

  private static void generatePermutations(int[] arr, int length, List<Integer> tempList) {
   if(tempList.size()==length) {
     System.out.println(tempList);
     return;
   }
   for(int i = 0 ; i < arr.length; i++) {
     tempList.add(arr[i]);

     generatePermutations(arr,length,tempList);

     tempList.remove(tempList.size()-1);
   }
  }
}
