package com.example.coding.cde;

import java.io.*;
import java.util.StringTokenizer;
public class num5086 {
  public static void main(String[] args) throws IOException {
    BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(System.out));

    while (true) {
      String str = bfr.readLine();
      StringTokenizer st = new StringTokenizer(str, " ");
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());

      if(a == 0 && b == 0) {
        break;
      }

      if(a % b == 0) {
        bfw.write("multiple");
      }
      else if(b % a == 0) {
        bfw.write("factor");
      }
      else {
        bfw.write("neither");
      }
      bfw.newLine();
    }

    bfr.close();
    bfw.flush();
    bfw.close();
  }
}
