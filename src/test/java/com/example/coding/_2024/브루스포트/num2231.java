package com.example.coding._2024.브루스포트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num2231 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String a = br.readLine();
    int N = Integer.parseInt(a);
    int result = 0;
    for(int i = 0 ;i < N ; i++) {
      int number = i;
      int sum = 0;	// 각 자릿수 합 변수

      while(number != 0) {
        sum += number % 10;	// 각 자릿수 더하기
        number /= 10;
      }

      // i 값과 각 자릿수 누적합이 같을 경우 (생성자를 찾았을 경우)
      if(sum + i == N) {
        result = i;
        break;
      }
    }
    System.out.println(result);
  }
}
