package com.example.coding.그리디;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class num4796 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int m=0,n=0,total = 0,i = 0;
    while(true) {
      i++;
      int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      if(array[0]==0 && array[1]==0 && array[2]==0){
        break;
      }
      m = array[2]/array[1];
      total = total+m*array[0];
      n = array[2]%array[1];
      if(array[0]>=n) {
        total+=n;
      } else {
        total+=array[0];
      }
      bw.write("Case "+i+": "+total);
      bw.newLine();
      total=0;
    }
    bw.flush();
    bw.close();

  }
}
