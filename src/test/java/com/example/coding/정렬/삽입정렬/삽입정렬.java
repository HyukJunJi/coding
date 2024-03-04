package com.example.coding.정렬.삽입정렬;

public class 삽입정렬 {
  public static void main(String[] args) {
    int i,j,tmp;
    int [] array = {4,5,1,3,2};
    int N = array.length;
    for(i = 0 ; i < N-1; i++) {
      j=i;
      while(j>=0 && array[j] > array[j+1]) {
        tmp = array[j];
        array[j] = array[j+1];
        array[j+1] = tmp;
        j--;
      }
    }
    for(int a:array) {
      System.out.print(a+" ");
    }

  }
}
