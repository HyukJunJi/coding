package com.example.coding._2024.재귀.DFS;

import java.util.Scanner;

//https://velog.io/@sds1vrk/%EC%9E%90%EB%B0%94-%EB%AC%B8%EB%B2%95-%EB%B0%8F-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-DFS-BFS
public class 부분집합구하기2 {
  // static 전역변수
  static int n;
  static int arr[];

  public void dfs(int k) {
    // 종료
    if (k==n+1) {
      // 출력
      String temp="";
      for (int i=1;i<=n;i++) {
        // 1인것만 temp에 넣는다.
        if (arr[i]==1) {
          temp+=i+" ";
        }
      }
      // 공집합은 제외
      if (temp.length()>0) {
        System.out.println(temp);
      }
    }
    else {
      // 있다.
      arr[k]=1;
      dfs(k+1);
      // 없다.
      arr[k]=0;
      dfs(k+1);
    }
  }
  public void solution() {
    dfs(1);
  }
  public static void main(String[] args) {
    부분집합구하기2 main=new 부분집합구하기2();
    Scanner scan=new Scanner(System.in);
    n=scan.nextInt();
    arr=new int[n+1];
    main.solution();
  }
}
