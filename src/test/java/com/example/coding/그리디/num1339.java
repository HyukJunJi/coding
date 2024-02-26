package com.example.coding.그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class num1339 {
  public static String[][] al;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    al = new String[N][];
    for(int i = 0 ; i < N ; i++) {
      String[] array = Arrays.stream(br.readLine().split("")).toArray(String[]::new);
      al[i] = new String[array.length];
      for(int j = 0 ; j < array.length; j++) {
        al[i][j] = array[j];
      }
    }



    for(int i = 0 ; i < N ; i++) {
      for(int j = al[i].length - 1; j >= 0; j--) {
        System.out.println((al[i].length-1)-j);
        System.out.println(Math.pow(10,al[i].length-1)-j);
        al[i][j] = Math.pow(10,al[i].length-1-j)+al[i][j];
      }
    }
    for(int i = 0 ; i < N ; i ++) {
      Arrays.sort(al[i], Comparator.reverseOrder());
    }
    for(String [] a: al) {
      for(String b: a) {
        System.out.print(b+" ");
      }
      System.out.println();
    }

  }
}
