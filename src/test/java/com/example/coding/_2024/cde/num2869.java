package com.example.coding._2024.cde;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class num2869 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int A = Integer.parseInt(st.nextToken());
    int B = Integer.parseInt(st.nextToken());
    int V = Integer.parseInt(st.nextToken());

    int day = (V - B) / (A - B);

    // 나머지가 있을 경우 (잔여 블럭이 있을 경우)
    if ((V - B) % (A  - B) != 0) {
      day++;
    }
    bw.write(String.valueOf(day));
    bw.flush();
    bw.close();
  }
}
