package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece { //subclasse da classe Piece
    private Color color;

    //--------------------------------------------------------------------------------
    public ChessPiece(Board board, Color color) {
        super(board); //contrutor da superclasse (classe Piece)
        this.color = color;
    }
    //--------------------------------------------------------------------------------
    public Color getColor() {
        return color;
    }
}
