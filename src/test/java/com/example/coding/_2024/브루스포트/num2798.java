package com.example.coding._2024.브루스포트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class num2798 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st1 =new StringTokenizer(br.readLine());
    int []a = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    int N = Integer.parseInt(st1.nextToken());
    int M = Integer.parseInt(st1.nextToken());
    int tmp= Integer.MIN_VALUE;
    List<Integer> arr= new ArrayList<>();

    for(int i = 0 ; i < N ; i++) {
      for(int j = 0 ; j < N-1 ; j ++) {
        for(int k = 0 ; k < N-2 ; k ++) {
          if(M>=a[i]+a[j]+a[k] && i != j && j!=k && i!=k ) {
            tmp=a[i]+a[j]+a[k];
            arr.add(tmp);
          }
        }
      }
    }
    List<Integer> sorted = arr.stream().sorted().collect(Collectors.toList());
    System.out.println(sorted.get(sorted.size()-1));

  }
}
