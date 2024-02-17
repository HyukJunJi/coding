package com.example.coding.해쉬;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class 베스트앨범 {
  public static void main(String[] args) {
    Solution s = new Solution();
    String [] a = {"classic", "classic", "classic", "classic", "classic"};
    int []  b = {500, 600, 150, 800, 2500};
    System.out.println(s.solution(a,b));
  }
  public static class Solution {
    public int[] solution(String[] genres, int[] plays) {
      int[] answer = {};
      Map<Integer, String> numAndGenre = new HashMap<>();
      Map<Integer, Integer> numAndPlay =  new HashMap<>();
      ArrayList<Integer> arr = new ArrayList<>();
      for(int i = 0 ; i < genres.length; i++) {
        numAndGenre.put(i,genres[i]);
        numAndPlay.put(i, plays[i]);
      }
      List<Integer> keySet = new ArrayList<>(numAndPlay.keySet());
      keySet.sort(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
          return numAndPlay.get(o2).compareTo(numAndPlay.get(o1));
        }
      });
      for(Integer k : keySet) {
        System.out.println(numAndGenre.get(k));
      }
      System.out.println("numAndGenre = " + numAndGenre);
      System.out.println("numAndPlay = " + numAndPlay);
      System.out.println("keySet = " + keySet);
      for(int i = 0; i < keySet.size(); i++) {
        for(Integer k : keySet) {
          System.out.println(numAndGenre.get(k));
        }
        for(int j = 1; j < keySet.size(); j++) {
          if(i==j || i>j || numAndGenre.get(keySet.get(i)).isEmpty()) continue;
          System.out.println("i+j = " + (i)+(j));
          if(numAndGenre.get(keySet.get(i)).equals(numAndGenre.get(keySet.get(j)))) {
            System.out.println("numAndGenre = " + numAndGenre.get(keySet.get(i)));
            System.out.println("numAndGenre = " + numAndGenre.get(keySet.get(j)));
            arr.add(keySet.get(i));
            arr.add(keySet.get(j));
            numAndGenre.replace(keySet.get(i),"");
            numAndGenre.replace(keySet.get(j),"");
            break;
          } if(j==keySet.size()-1) {

            arr.add(keySet.get(i));
            System.out.println("numAndGenre.get(keySet.get(i)) else = " + numAndGenre.get(keySet.get(i)));
            numAndGenre.replace(keySet.get(i),"");
          }

        }

      }


        


      System.out.println(" = " + arr);
      return answer;
    }
  }
}
