package com.example.coding.cde;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class num1978 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    List<Integer> arr = new ArrayList<>();
    int cnt=0;
    int[] num =
        Stream.
            of(br.readLine().split(" "))
            .mapToInt(Integer::parseInt)
            .toArray();
    for(int i = 0; i < N ; i++){
      for(int j = 1;j<=num[i];j++) {
        if(num[i]%j==0)
        arr.add(j);
      }
      if(arr.size()==2) {
        cnt++;
      }
      arr.clear();
    }
    System.out.println(cnt);
  }
}
