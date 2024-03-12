package application;

import java.util.Scanner;

import chess.ChessMatch;

public class App {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    ChessMatch chessMatch = new ChessMatch();
    UI.printBoard(chessMatch.getPieces());

    sc.close();
  }
}
