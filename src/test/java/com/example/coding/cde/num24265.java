package com.example.coding.cde;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num24265 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    long n = Integer.parseInt(br.readLine());
    System.out.println(n * (n - 1) / 2 + "\n" + 2);
  }
}
//https://velog.io/@gayeong39/%EB%B0%B1%EC%A4%80-24265-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EC%88%98%EC%97%85-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98