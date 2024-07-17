package TicTacToe.strategies;

import TicTacToe.models.Board;
import TicTacToe.models.Move;

import java.util.HashMap;

public class ColWinningStrategy implements WinningStrategy {
    HashMap<Integer, HashMap<Character , Integer>> counts = new HashMap<>();
    @Override
    public boolean checkWinner(Board board , Move move) {
        // do the algo - O(1)
        // 0 -> { "X" : count}
        // 1 ->
        int col = move.getCell().getCol();
        Character sym = move.getCell().getSymbol().getSym();
        // this is to check if there is a hashmap for the corresponding row
        if(!counts.containsKey(col)){
            counts.put(col , new HashMap<>());
        }

        HashMap<Character , Integer> countCol = counts.get(col);
        // this is to check if a particular symbol is present in the hashmap
        if(!countCol.containsKey(sym)){
            countCol.put(sym, 0);
        }
        // updating the frequency of the symbol in the corresponding row
        countCol.put(sym, countCol.get(sym) + 1);

        // check if winner has arrived
        if(countCol.get(sym) == board.getSize()){
            return true;
        }
        return false;
    }
}
