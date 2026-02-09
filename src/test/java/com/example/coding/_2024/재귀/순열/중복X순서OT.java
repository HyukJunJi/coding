package com.example.coding._2024.재귀.순열;

import java.util.ArrayList;
import java.util.List;

//중복이 없고 순서가 있는건 2,1과 1,2를 다름
public class 중복X순서OT {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3}; // 초기 배열
    generatePermutations(arr, 2, new boolean[arr.length], new ArrayList<>());
  }

  public static void generatePermutations(int[] arr,int length, boolean[] used, List<Integer> permutation) {
    if(permutation.size()==length) {
      System.out.println(permutation);
      return;
    }
    for(int i = 0 ; i < arr.length; i++) {
      if(!used[i]) {
        used[i] = true;
        permutation.add(arr[i]);
        generatePermutations(arr,length,used,permutation);

        used[i] = false;
        permutation.remove(permutation.size()-1);
      }
    }
  }
}
