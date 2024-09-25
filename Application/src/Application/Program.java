package Application;

import chess.ChessMatch;
import javax.swing.UIClientPropertyKey;

public class Program{
public static void main(String[] args) {

    ChessMatch chessMatch = new ChessMatch();
    UI.printBoard(chessMatch.getPieces());
}
}
