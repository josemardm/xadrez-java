package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
    private Board board;

    //--------------------------------------------------------------------------------
    public ChessMatch() {
        board = new Board(8, 8);
        initialSetup();
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
    private void initialSetup(){
        board.placePiece(new Rook(board, Color.WHITE),new Position(2,1));
        board.placePiece(new King(board, Color.BLACK),new Position(0,4));
        board.placePiece(new King(board, Color.WHITE),new Position(7,4));
    }
}

