package com.example.coding.digit;

public class changedigit {
  public static void main(String[] args) {
    char[] d= new char[10];
    char[] chars = cardConv(90, 16, d);
    for(char c:chars){
      System.out.println("c = " + c);
    }
//    System.out.println(cardConv(36, 16,d));
  }
  public static char[] cardConv(int x, int r, char[]d) {
    int digits = 0;
    String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    do{
      d[digits++] = dchar.charAt(x%r);
      x/=r;
    } while(x!=0);

    for(int i = 0 ; i <digits/2; i++) {
      char t = d[i];
      d[i] = d[digits-i -1];
      d[digits-i-1]= t;
    }
    return d;
  }
}
