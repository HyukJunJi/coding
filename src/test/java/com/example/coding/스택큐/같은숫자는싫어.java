package com.example.coding.스택큐;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class 같은숫자는싫어 {
  public static void main(String[] args) {
    int [] arr = {1,1,1,3,3,0,1,1,3,1};
    Queue<Integer> queue = new LinkedList<>();
    for(int i = 1 ; i <arr.length;i++) {
      System.out.println("arr[i-1] +arr[i] = " + arr[i-1] +arr[i]);
      if(arr[i-1]!=arr[i]) {
        System.out.println("arr[i-1] = " + arr[i-1]);
        queue.add(arr[i-1]);
      }
    }
    queue.add(arr[arr.length-1]);
    System.out.println("queue = " + queue);
  }
}
