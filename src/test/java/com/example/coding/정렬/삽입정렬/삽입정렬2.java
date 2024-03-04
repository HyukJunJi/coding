package com.example.coding.정렬.삽입정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 삽입정렬2 {

  public static void main(String[] args) throws IOException {
    int i,tmp;
    int [] A = {4,5,1,3,2};
    int N = A.length;

    for (i=1; i<N; i++) {
      int loc = i - 1;
      int newItem = A[i];
      while (0 <= loc && newItem < A[loc]) {
        A[loc + 1] = A[loc];
        loc--;
      }
      if (loc + 1 != i) {
        A[loc + 1] = newItem;

      }
    }
    for(int a : A) {
      System.out.print(a+" ");
    }
    System.out.println();
  }
}
