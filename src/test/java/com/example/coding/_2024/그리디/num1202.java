package com.example.coding._2024.그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class num1202 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());
    int[][] MV = new int[N][2];
    Integer[] C = new Integer[K];
    for(int i = 0 ; i < N ; i++) {
      int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      MV[i][0] = array[0];
      MV[i][1] = array[1];
    }
    Arrays.sort(MV, new Comparator<int[]>() {
      @Override
      public int compare(int[] o1, int[] o2) {
        if(o1[1]==o2[1]) {
          return o2[0]-o1[0];
        }
        return o2[1]-o1[1];
      }
    });

    for(int i = 0 ; i < K ; i ++) {
      int array = Integer.parseInt(br.readLine());
      C[i] = array;
    }
    for(int[] s:MV){
      for(int b: s) {
        System.out.print(b+" ");
      }
      System.out.println();
    }
    System.out.println("C");
    int sum= 0;
    int cntI = 0;
    int cnt=K;
    Arrays.sort(C, Collections.reverseOrder());
    for(int s : C) {
      System.out.println(s+" ");
    }
    System.out.println();
//    for(int i = cntI ; i < N; i++) {
//      for(int j = cnt-1; j >= 0; j--) {
//        if(MV[i][0]<=C[j]) {
//          cnt--;
//          cntI++;
//          System.out.println("MV[i][0]+\" \"+MV[i][1]+\" \"+C[j] = " + MV[i][0]+" "+MV[i][1]+" "+C[j]);
//          sum+=MV[i][1];
//          break;
//        }
//      }
//      if(cnt==0) {
//        break;
//      }
//    }
    for(int i = 0 ; i < K ; i++) {

    }
    System.out.println(sum);
  }
}
