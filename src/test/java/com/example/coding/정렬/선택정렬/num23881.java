package com.example.coding.정렬.선택정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num23881 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());
    int [] array = new int[N];
    st = new StringTokenizer(br.readLine());
    for(int i = 0 ; i < N ; i++) {
      array[i] = Integer.parseInt(st.nextToken());
    }
    int cnt=0;
    for(int last = N-1 ; last>=1 ; last--) {
      int maxIndex = 0;
      for (int i = 1; i <= last; i++) {
        if (array[i] > array[maxIndex]) {
          maxIndex = i;
        }
      }
      if(last != maxIndex) {
        int tmp = array[last];
        array[last] = array[maxIndex];
        array[maxIndex] = tmp;
        cnt++;
        if(cnt == K) {
          System.out.println(array[maxIndex]+" "+array[last]);
          return;
        }
      }
    }
    System.out.println(-1);
  }
}
