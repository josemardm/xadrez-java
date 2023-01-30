package chess;

import boardgame.Board;

public class ChessMatch {
    private Board board;

    //--------------------------------------------------------------------------------
    public ChessMatch() {
        board = new Board(8, 8);
    }

    //--------------------------------------------------------------------------------
    public ChessPiece[][] getPieces() {
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for (int linha = 0; linha < board.getRows(); linha++) {
            for (int coluna = 0; coluna < board.getColumns(); coluna++) {
                mat[linha][coluna] = (ChessPiece) board.piece(linha, coluna);
            }
        }
        return mat;
    }
}

