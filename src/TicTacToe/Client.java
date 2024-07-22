package TicTacToe;

import TicTacToe.controllers.GameController;
import TicTacToe.models.*;
import TicTacToe.strategies.ColWinningStrategy;
import TicTacToe.strategies.RowWinningStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        GameController gameController = new GameController();

        List<Player> players = new ArrayList<>();
        players.add(new HumanPlayer(1 , "Mohit" , PlayerType.HUMAN , new Symbol('O')));
        players.add(new BotPlayer(2 , "Botty", PlayerType.BOT, new Symbol('X') , BotDifficultyLevel.EASY));

        Game game = gameController.startGame(
                3,
                players,
                List.of(new RowWinningStrategy() ,  new ColWinningStrategy())
        );
        // for every new client, do you generate a new waiter
//        GameController gameController2 = new GameController();

//        Game game2 = gameController.startGame();
        gameController.display(game);

        while(gameController.checkState(game).equals(GameState.IN_PROGRESS)) {
            gameController.makeMove(game);
            gameController.display(game);

            System.out.println("Do you want to Undo ? [Y/N]");
            String undoAnswer = scanner.nextLine();
            if(undoAnswer.equals("Y")) {
                gameController.undo(game);
                System.out.println("Undo is successfull!");
                gameController.display(game);
            }
        }

        if(gameController.checkState(game).equals(GameState.SUCCESS)) {
            System.out.println(gameController.getWinner(game).getName() + " won the game");
        } else if (gameController.checkState(game).equals(GameState.DRAW)) {
            System.out.println("Game results in a draw");
        }
    }
}

// 1. create your models
// 2. Get ready your controller and basic interaction with the client
// 3. Make sure that every model has a constructor
// 4. Implement the functionalities one by one
//      a. start the game
//      b. display
//      c. makeMove : game , player , winning Strategy , bot move
//      d. undo





// HW
// 1. Create other strategies : Try to implement the function before next class
// 2. Clean the validate code + validate symbol