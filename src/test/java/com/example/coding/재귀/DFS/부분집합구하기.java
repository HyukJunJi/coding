package com.example.coding.재귀.DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//https://velog.io/@sds1vrk/%EC%9E%90%EB%B0%94-%EB%AC%B8%EB%B2%95-%EB%B0%8F-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-DFS-BFS
public class 부분집합구하기 {
  public static List<List<Integer>> arr= new ArrayList<>();
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int [] num = new int[N];
    for(int i = 0 ; i < N ; i++) {
      num[i] = i+1;
    }
    for(int i = 0; i < N; i++) {
      dfs(num,i+1,0,new ArrayList<>());
    }

    arr.sort(new Comparator<List<Integer>>() {
      @Override
      public int compare(List<Integer> o1, List<Integer> o2) {
        if(o1.get(0).equals(o2.get(0))) {
          return o2.size()-o1.size();
        }
        return o1.get(0)-o2.get(0);
      }
    });
    for(List<Integer> a:arr) {
      System.out.println("a = " + a);
    }
  }
  public static void dfs(int[] num, int n,int start, List<Integer> templist) {
    if(templist.size()==n) {
      System.out.println(templist);
      List<Integer> list = templist.stream().toList();
      arr.add(list);
      return;
    }
    for(int i = start;i<num.length;i++) {
      templist.add(num[i]);
      dfs(num,n,i+1,templist);
      templist.remove(templist.size()-1);
    }
  }
}
