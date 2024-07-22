package TicTacToe.strategies;

import TicTacToe.models.Board;
import TicTacToe.models.Move;

public interface WinningStrategy {
    public boolean checkWinner(Board board , Move move);
    public void handleUndo(Board board , Move move);
}
