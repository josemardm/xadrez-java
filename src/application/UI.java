package application;

import chess.ChessPiece;

public class UI {
    public static void printBoard(ChessPiece[][] pieces) {
        for (int linha = 0; linha < pieces.length; linha++) {
            System.out.print((8 - linha) + " ");
            for (int coluna = 0; coluna < pieces.length; coluna++) {
                printPiece(pieces[linha][coluna]);
            }
            System.out.println();
        }
        System.out.println("  a b c d e f g h");

    }

    private static void printPiece(ChessPiece piece) {
        if (piece == null) {
            System.out.print("-");
        } else {
            System.out.print(piece);
        }
        System.out.print(" ");
    }
}
