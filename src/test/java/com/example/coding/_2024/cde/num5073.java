package com.example.coding._2024.cde;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.stream.Stream;

public class num5073 {
  public static void main(String[] args) throws IOException {
    BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int max = Integer.MIN_VALUE;
    int index = 0;
    while(true){
      int[] a = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      if(a[0]==0 && a[1] ==0 && a[2]==0) {
        break;
      }
      for(int i = 0 ; i < 3 ; i ++) {
        if(max<a[i]) {
          max = a[i];
          index = i;
        }
      }
      if(index == 0) {
        if(a[index]>=(a[1]+a[2])) {
          bw.write("Invalid");
        }
        else {
          if(a[index]==a[1] && a[1]==a[2]) {
            bw.write("Equilateral");
          } else if(a[index] == a[1] || a[index] ==a[2] || a[1]==a[2]) {
            bw.write("Isosceles");
          } else {
            bw.write("Scalene");
          }
        }
      } else if(index == 1) {
        if(a[index]>=(a[0]+a[2])) {
          bw.write("Invalid");
        }
        else {
          if(a[index]==a[0] && a[0]==a[2]) {
            bw.write("Equilateral");
          } else if(a[index] == a[0] || a[index] ==a[2] || a[0]==a[2]) {
            bw.write("Isosceles");
          } else {
            bw.write("Scalene");
          }
        }
      } else {
        if(a[index]>=(a[1]+a[0])) {
          bw.write("Invalid");
        }
        else {
          if(a[index]==a[1] && a[1]==a[0]) {
            bw.write("Equilateral");
          } else if(a[index] == a[1] || a[index] ==a[0] || a[1]==a[0]) {
            bw.write("Isosceles");
          } else {
            bw.write("Scalene");
          }
        }
      }
      bw.newLine();
      max = Integer.MIN_VALUE;
    }
    bw.flush();
    bw.close();
    br.close();
  }

}
