package TicTacToe;

import TicTacToe.controllers.GameController;
import TicTacToe.models.*;
import TicTacToe.strategies.RowWinningStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        GameController gameController = new GameController();

        List<Player> players = new ArrayList<>();

        players.add(new HumanPlayer(1 , "Mohit" , PlayerType.HUMAN , new Symbol('O')));
        players.add(new BotPlayer(2 , "Botty", PlayerType.BOT, new Symbol('X') , BotDifficultyLevel.EASY));

        // testing player size exceeding limit
        /*for(int i = 1; i <= 25; i++){
            players.add(new HumanPlayer(i , "Mohit" , PlayerType.HUMAN , new Symbol('O')));
        }*/
        //players.add(new BotPlayer(26 , "Botty", PlayerType.BOT, new Symbol('X') , BotDifficultyLevel.EASY));
        // players.add(new HumanPlayer(27 , "Mohit" , PlayerType.HUMAN , new Symbol('O')));

        Game game = gameController.startGame(
                2,
                players,
                List.of(new RowWinningStrategy())
        );
        // for every new client, do you generate a new waiter
//        GameController gameController2 = new GameController();

//        Game game2 = gameController.startGame();

/*      testing unique symbol for players
        for(int i = 0; i < 26; i++){
            System.out.println(players.get(i).getSymbol().getSym());
        }
        gameController.display(game);*/

        boolean wantToExit = false;
        Scanner scanner = new Scanner(System.in);
        while((!wantToExit) && gameController.checkState(game).equals(GameState.IN_PROGRESS)) {
            gameController.display(game);

            gameController.makeMove(game);

            System.out.println("want to undo the game ? : enter Y or N");
            char optionToUndo = scanner.next().charAt(0);
            if(optionToUndo == 'Y') {
                gameController.undo(game);
            }

            System.out.println("want to exit the game ? : enter Y or N");
            char optionToExit = scanner.next().charAt(0);
            if(optionToExit == 'Y') {
                wantToExit = true;
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





// HW
// 1. Create other strategies : Try to implement the function before next class
// 2. Clean the validate code + validate symbol