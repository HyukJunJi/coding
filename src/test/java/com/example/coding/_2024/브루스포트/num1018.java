package com.example.coding._2024.브루스포트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class num1018 {
  public static int getSolution(int startRow, int startCol, String[] board) {
    String[] orgBoard = {"WBWBWBWB","BWBWBWBW"};
    int whiteSol = 0 ;
    for(int i = 0 ; i <8;i++) {
      int row =startRow+i;
      for(int j = 0 ; j<8;j++) {
        int col = startCol + j;
        if(board[row].charAt(col) != orgBoard[row%2].charAt(j)) whiteSol++;
      }
    }

    return Math.min(whiteSol, 64-whiteSol);
  }
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] s = br.readLine().split(" ");

    int N = Integer.parseInt(s[0]);
    int M = Integer.parseInt(s[1]);
    String[] board = new String[N];
    for(int i = 0 ; i < N ; i++) board[i] = br.readLine();
    int sol = Integer.MAX_VALUE;
    for(int i = 0 ; i<=N-8 ; i++) {
      for(int j = 0 ; j<=M-8 ; j++) {
        int curSol = getSolution(i,j,board);
        if(sol > curSol) sol= curSol;
      }
    }

    System.out.println(sol);

  }
}
