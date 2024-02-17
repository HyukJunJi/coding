package com.example.coding.cde;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class num2501 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String s = br.readLine();
    StringTokenizer st = new StringTokenizer(s," ");
    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());
    List<Integer> arr = new ArrayList<>();
    for (int i = 1 ; i <= N ; i++) {
      if (N % i == 0) {
        arr.add(i);
      }
    }
    try {
      bw.write(String.valueOf(arr.get(K-1)));
    } catch (Exception e) {
      bw.write("0");
    }
    bw.flush();
    br.close();
    bw.close();
  }
}
