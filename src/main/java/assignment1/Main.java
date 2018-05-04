package assignment1;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Reversi reversi = new Reversi();
    String input;

    while(!(input = sc.nextLine()).equals("")) {
      System.out.println(reversi.reverseWords(input));
    }
  }
}
