package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Lady extends ChessPiece {
    public Lady(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "L";
    }
}
