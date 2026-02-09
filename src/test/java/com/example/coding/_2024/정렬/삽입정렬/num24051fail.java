package com.example.coding._2024.정렬.삽입정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class num24051fail {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());
    int cnt = 0;
    long[] array = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
    int i,j;
    long tmp;
    for(i = 0; i < N-1 ; i++) {
      j=i;
      cnt++;
      while(j>0 && array[j] > array[j+1]) {
        tmp = array[j];
        array[j] = array[j+1];
        array[j+1] = tmp;
        j--;
        cnt++;
        if(cnt==K) {
          System.out.println(tmp);
          return;
        }
      }
      if(cnt==K) {
        System.out.println(array[j+1]);
        return;
      }
    }
    System.out.println(-1);
  }
}
