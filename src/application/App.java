package application;

import java.util.Scanner;

import boardgame.Position;

public class App {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    Position pos = new Position(3, 5);
    System.out.println(pos);
    sc.close();
  }
}
