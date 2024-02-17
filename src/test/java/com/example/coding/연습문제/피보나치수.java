package com.example.coding.연습문제;

import java.util.Arrays;

public class 피보나치수 {
  public static void main(String[] args) {
    int a = 10000;
    int[] D = new int[a + 1];
    D[0] = 0;
    D[1] = 1;
    for (int i = 2; i <= a; i++) {
      D[i] = (D[i - 1] + D[i - 2]) % 1234567;
    }
    System.out.println("D[a] = " + D[a]);
    System.out.println("Arrays.toString(D) = " + Arrays.toString(D));
  }
}
