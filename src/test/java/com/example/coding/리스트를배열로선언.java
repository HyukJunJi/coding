package com.example.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 리스트를배열로선언 {
  public static void main(String[] args) {
    // 경고를 피하기 위해 @SuppressWarnings 애너테이션 사용
    @SuppressWarnings("unchecked")
    List<Integer>[] arr = new List[3]; // 크기가 3인 리스트 배열 생성

    // 배열의 각 요소에 리스트 할당
    arr[0] = new ArrayList<>(Arrays.asList(1, 2, 3));
    arr[1] = new ArrayList<>(Arrays.asList(4, 5));
    arr[2] = new ArrayList<>(Arrays.asList(6, 7, 8, 9));

    // 데이터 출력
    System.out.println("List<Integer>[] arr 데이터 출력:");
    for (int i = 0; i < arr.length; i++) {
      System.out.println("arr[" + i + "]: " + arr[i]);
    }

    // 데이터 저장 방식 확인
    System.out.println("\n각 리스트에 데이터 추가 후 확인:");
    arr[0].add(10);
    arr[1].addAll(Arrays.asList(11, 12));
    arr[2].remove(Integer.valueOf(8)); // 객체 8 제거

    for (int i = 0; i < arr.length; i++) {
      System.out.println("arr[" + i + "]: " + arr[i]);
    }
  }
}
