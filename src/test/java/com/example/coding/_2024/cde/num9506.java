package com.example.coding._2024.cde;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class num9506 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    List<Integer> arr = new ArrayList<>();
    int sum = 0;

    while (true) {
      int n = Integer.parseInt(br.readLine());
      if (n == -1) {
        break;
      }
      for (int i = 1; i < n; i++) {
        if (n % i == 0) {
          arr.add(i);
        }
      }
      for (int i = 0; i < arr.size(); i++) {
        sum = sum + arr.get(i);
      }
      if (sum == n) {
        sb.append(n + " = ");
        for (int i = 0; i < arr.size(); i++) {
          sb.append(arr.get(i));

          if (i == arr.size() - 1) {
            sb.append(System.lineSeparator());
            break;
          }
          sb.append(" + ");
        }
      } else {
        sb.append(n + " is NOT perfect.\n");
      }
      sum = 0;
      arr.clear();
    }
    System.out.println(sb);
  }
}
