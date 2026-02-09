package com.example.coding._2024.cde;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class num2581_1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int M = Integer.parseInt(br.readLine());
    int N = Integer.parseInt(br.readLine());

    List<Integer> whoIsSoSu = new ArrayList<>();
    int sum = 0;

    for (int i = M; i <= N; i++) {
      if (isPrime(i)) {
        whoIsSoSu.add(i);
      }
    }

    if (!whoIsSoSu.isEmpty()) {
      for (int i : whoIsSoSu) {
        sum += i;
      }
      System.out.println(sum);
      System.out.println(whoIsSoSu.get(0));
    } else {
      System.out.println(-1);
    }
  }
  private static boolean isPrime(int num) {
    if (num < 2) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }
}

