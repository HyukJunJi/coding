package com.example.coding._2024.정렬.버블정렬;

public class 버블정렬 {
  public static void main(String[] args) {
    int []arr = {3,5,4,2,1};
    for(int a: arr) {
      System.out.print(a+" ");
    }
    System.out.println();
    for(int i = 0 ; i < arr.length; i++) {

      for(int j = 1 ; j < arr.length-i ; j++) {
        if(arr[j-1]>arr[j]) {
          int tmp = arr[j];
          arr[j] = arr[j-1];
          arr[j-1] = tmp;
        }
      }
    }
    for(int a: arr) {
      System.out.print(a+" ");
    }
  }
}
