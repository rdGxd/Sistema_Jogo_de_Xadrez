package application;

import java.util.Scanner;

import boardgame.Board;

public class App {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    Board board = new Board(8, 8);

    sc.close();
  }
}
