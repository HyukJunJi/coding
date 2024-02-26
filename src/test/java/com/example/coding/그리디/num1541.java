package com.example.coding.그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class num1541 {
  public static int sum = 0;
  public static List<Integer> nums;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    String[] split = str.split("-");
    nums = new ArrayList<>();
    for(int i = 0 ; i< split.length ; i++) {
      if(split[i].contains("+")) {
        int[] array = Arrays.stream(split[i].split("\\+")).mapToInt(Integer::parseInt).toArray();
        for(int j = 0 ; j < array.length ;j ++) {
          sum += array[j];
        }
        nums.add(sum);
        sum=0;
      } else {
        nums.add(Integer.parseInt(split[i]));
      }
    }
    sum = nums.get(0);
    for(int i = 1 ; i< nums.size(); i++) {
      sum -=nums.get(i);
    }
    System.out.println(sum);
  }
}
