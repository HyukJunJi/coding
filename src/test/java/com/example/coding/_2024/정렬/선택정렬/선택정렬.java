package com.example.coding._2024.정렬.선택정렬;

public class 선택정렬 {
  public static int idx;
  public static void main(String[] args) {
    int [] array = {3,6,1,8,2,4};
    int min = Integer.MAX_VALUE;
    int tmp;
    int j;
    for(int i = 0 ; i < array.length;i++) {
      j=i;
      while(j<array.length) {
        if(array[j]<min) {
          min = array[j];
          idx = j;
        }
        j++;
      }
      min = Integer.MAX_VALUE;
      tmp = array[i];
      array[i] = array[idx];
      array[idx] = tmp;
    }
    for(int a: array) {
      System.out.print(a+" ");
    }
  }
}
