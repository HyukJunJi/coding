package com.example.coding._2024.정렬.퀵정렬;

import java.util.Stack;

public class 퀵정렬 {
  static class Range {
    int start, end;

    Range(int start, int end) {
      this.start = start;
      this.end = end;
    }
  }

  public static void quickSortIterative(int[] arr) {
    Stack<Range> stack = new Stack<>();

    // 전체 배열 범위를 스택에 푸시
    stack.push(new Range(0, arr.length - 1));

    while (!stack.isEmpty()) {
      Range range = stack.pop();
      int start = range.start, end = range.end;

      // 분할할 필요가 없으면 계속
      if (start >= end) continue;

      int pivot = arr[start];
      int i = start, j = end;

      while (i < j) {
        // 오른쪽에서 pivot보다 작은 요소를 찾음
        while (i < j && arr[j] >= pivot) j--;
        // 왼쪽에서 pivot보다 큰 요소를 찾음
        while (i < j && arr[i] <= pivot) i++;

        // 교환
        if (i < j) {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }

      // pivot을 올바른 위치로 교환
      int temp = arr[start];
      arr[start] = arr[j];
      arr[j] = temp;

      // 분할된 범위를 스택에 푸시
      stack.push(new Range(start, j - 1));
      stack.push(new Range(j + 1, end));
    }
  }

  public static void main(String[] args) {
    int[] arr = {10, 7, 8, 9, 1, 5};
    quickSortIterative(arr);
    System.out.println("정렬된 배열:");
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }
}
