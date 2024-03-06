package com.example.coding.정렬.퀵정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class num24090 {
  public static int A,K;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    A = Integer.parseInt(st.nextToken());
    K = Integer.parseInt(st.nextToken());
    int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    quick_sort(array,0, array.length-1);
    for(int a: array) {
      System.out.println(a);
    }
  }
  private static void quick_sort(int[] arr,int start, int end) {
    if(start<end) {
      int part = partition(arr,start,end);
      quick_sort(arr, start, part-1);
      quick_sort(arr,part+1, end);
    }
  }
  private static int partition(int[] arr, int start, int end) {
    int pivot = arr[end];
    int i = start - 1;

    for (int j = start; j < end; j++) {
      if (arr[j] <= pivot) {
        i++;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }
    if(i+1 != end) {
      int tmp = arr[i+1];
      arr[i+1] = arr[end];
      arr[end] = tmp;
    }
    return i + 1;
  }
}
