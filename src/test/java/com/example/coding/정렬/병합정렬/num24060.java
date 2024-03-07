package com.example.coding.정렬.병합정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class num24060 {
  public static int A,N;
  public static int []tmp;
  public static int cnt=0;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    A = Integer.parseInt(st.nextToken());
    N = Integer.parseInt(st.nextToken());
    tmp = new int[A];
    int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    merge_sort(array,0, array.length-1);
    System.out.println(-1);
  }
  private static void merge_sort(int[] arr, int start, int end) {
    if(start<end) {
      int mid = (start+end)/2;
      merge_sort(arr,start, mid);
      merge_sort(arr,mid+1,end);
      merge(arr,start,mid,end);
    }
  }

  private static void merge(int[] arr, int start, int mid ,int end) {
    int i = start;
    int j = mid+1;
    int t = start;
    while(i <= mid && j <= end) {
      if(arr[i] <= arr[j]) {
        tmp[t]  = arr[i];
        cnt++;
        if(cnt==N) {
          System.out.println(arr[i]);
          System.exit(0);
        }
        t++;
        i++;
      } else {
        tmp[t] = arr[j];
        cnt++;
        if(cnt==N) {
          System.out.println(arr[j]);
          System.exit(0);
        }
        t++;
        j++;
      }
    }
    while(i<=mid) {
      tmp[t] = arr[i];
      cnt++;
      if(cnt==N) {
        System.out.println(arr[i]);
        System.exit(0);
      }
      t++;
      i++;
    }
    while(j<=end) {
      tmp[t] = arr[j];
      cnt++;
      if(cnt==N) {
        System.out.println(arr[j]);
        System.exit(0);
      }
      t++;
      j++;
    }
    for(int k = start ; k <=end ; k++) {
      arr[k] = tmp[k];
    }
  }
}
