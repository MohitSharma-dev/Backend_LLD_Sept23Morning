package TicTacToe.strategies;

import TicTacToe.models.Board;
import TicTacToe.models.Move;

import java.util.HashMap;

public class RowWinningStrategy implements WinningStrategy {
    HashMap<Integer, HashMap<Character , Integer> > counts = new HashMap<>();
    @Override
    public boolean checkWinner(Board board , Move move) {
        // do the algo - O(1)
        // 0 -> { "X" : count}
        // 1 ->
        int row = move.getCell().getRow();
        Character sym = move.getCell().getSymbol().getSym();
        // this is to check if there is a hashmap for the corresponding row
        if(!counts.containsKey(row)){
            counts.put(row , new HashMap<>());
        }

        HashMap<Character , Integer> countRow = counts.get(row);
        // this is to check if a particular symbol is present in the hashmap
        if(!countRow.containsKey(sym)){
            countRow.put(sym, 0);
        }
        // updating the frequency of the symbol in the corresponding row
        countRow.put(sym, countRow.get(sym) + 1);

        // check if winner has arrived
        if(countRow.get(sym) == board.getSize()){
            return true;
        }
        return false;
    }

    @Override
    public void handleUndo(Board board, Move move) {
        int row = move.getCell().getRow();
        Character sym = move.getPlayer().getSymbol().getSym();

        counts.get(row).put(sym, counts.get(row).get(sym) - 1);
    }
}
