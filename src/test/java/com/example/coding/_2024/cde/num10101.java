package com.example.coding._2024.cde;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num10101 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(br.readLine());
    int b = Integer.parseInt(br.readLine());
    int c = Integer.parseInt(br.readLine());
    System.out.println(square(a,b,c));

  }
  public static String square(int a, int b, int c) {
    if((a+b+c)!= 180) {
      return "Error";
    }
    if(a == b && b == c) {
      return "Equilateral";
    }
    if(a == b || a == c || b == c) {
      return"Isosceles";
    }
    if((a+b+c)==180) {
      return "Scalene";
    }
    return null;
  }
}
