package TicTacToe.models;

import java.util.Set;

public class SymbolManager {
    public static final int uniqueSymbols = 26;

    public static Character getUniqueSymbol(Set<Character> symbolSet){
        for(char c = 'A'; c <= 'Z'; c++){
            if(!symbolSet.contains(c)){
                return c;
            }
        }
        return null;
    }
}
