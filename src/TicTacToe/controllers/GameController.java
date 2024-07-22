package TicTacToe.controllers;

import TicTacToe.models.Board;
import TicTacToe.models.Game;
import TicTacToe.models.GameState;
import TicTacToe.models.Player;
import TicTacToe.strategies.WinningStrategy;

import java.util.List;

public class GameController {
    public Game startGame(
            int dimension,
            List<Player> players,
            List<WinningStrategy>  winningStrategies
    ){
        return Game
                .getBuilder()
                .setDimension(dimension)
                .setPlayers(players)
                .setWinningStrategies(winningStrategies)
                .build();
    }

    public GameState checkState(Game game){
        return game.getGameState();
    }

    public void display(Game game){
        game.displayBoard();
    }

    public void makeMove(Game game){
        game.makeMove();
    }

    public Player getWinner(Game game){
        return game.getWinner();
    }

    public void undo(Game game){
        game.undo();
    }
}



// 1. start the game : create , set the attributes, taking the input
// while the gameState IN_PROGRESS
// 2. display the board
// 3. Make the move : input , make the move, check for the winner , update the state

// 4.  check the state
    // if gameState is SUCCESS
        // 5. get the winner and display
    // else if gameState is DRAW
        // 6. declare the draw