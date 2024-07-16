package TicTacToe.models;

import TicTacToe.strategies.WinningStrategy;

import java.util.*;

public class Game {
    private Board board;
    private List<Player> players;
    private Player winner;
    private int nextPlayerIndex;
    private List<Move> moves;
    private GameState gameState;
    private List<WinningStrategy> winningStrategies;

    private Game(Builder builder){
        board = new Board(builder.noOfPlayers);
        players = builder.players;
        winningStrategies = builder.winningStrategies;
        winner = null;
        nextPlayerIndex = 0;
        moves = new ArrayList<>();
        gameState = GameState.IN_PROGRESS;
    }

    public List<WinningStrategy> getWinningStrategies() {
        return winningStrategies;
    }

    public void setWinningStrategies(List<WinningStrategy> winningStrategies) {
        this.winningStrategies = winningStrategies;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public int getNextPlayerIndex() {
        return nextPlayerIndex;
    }

    public void setNextPlayerIndex(int nextPlayerIndex) {
        this.nextPlayerIndex = nextPlayerIndex;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    public void displayBoard(){
        board.display();
    }

    public boolean isNotValidCell(int row, int col) {
        int boardSize = board.getSize();
        if(row < 0 || row >= boardSize || col < 0 || col >= boardSize){
            return true;
        }
        return false;
    }

    public boolean isNotEmptyCell(int row, int col) {
        return board.isNotEmptyCell(row, col);
    }

    public Cell fillCellWithCurrentSymbol(int row, int col, Player currentPlayer) {
        return board.fillCellWithCurrentSymbol(row, col, currentPlayer);
    }

    public void chooseNextPlayer() {
        //nextPlayerIndex = (nextPlayerIndex + 1) % players.size();
        nextPlayerIndex += 1;
        if(nextPlayerIndex == players.size()){
            nextPlayerIndex = 0;
        }
    }

    public void makeMove() {
        Scanner scanner = new Scanner(System.in);
        boolean choseCell = false;

        Player currentPlayer = players.get(nextPlayerIndex);

        System.out.println("Id : " + currentPlayer.getId() + "." + currentPlayer.getName() + "'s turn");

        while(!choseCell){
            System.out.println("Choose the row you want to enter : ");
            int row = scanner.nextInt();
            System.out.println("Choose the column you want to enter : ");
            int col = scanner.nextInt();

            if(isNotValidCell(row, col)){
                System.out.println("Please select row and column within board");
                continue;
            }

            if(isNotEmptyCell(row, col)){
                System.out.println("Selected Cell is not empty. Please select an empty cell");
                continue;
            }

            Cell selectedCell = fillCellWithCurrentSymbol(row, col, currentPlayer);

            moves.add(new Move(selectedCell, currentPlayer));
            chooseNextPlayer();
            choseCell = true;
        }
    }

    public void undo() {
        if(moves.isEmpty()){
            System.out.println("Nothing to undo");
            return;
        }

        Move lastMove = moves.getLast();
        lastMove.getCell().updateCellStatus(null, CellState.EMPTY);
        nextPlayerIndex = players.indexOf(lastMove.getPlayer());
        moves.removeLast();
    }

    public static class Builder{
        private int noOfPlayers;
        private List<Player> players;
        private List<WinningStrategy> winningStrategies;

        public Builder setNoOfPlayers(int noOfPlayers) {
            this.noOfPlayers = noOfPlayers;
            return this;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public Builder setWinningStrategies(List<WinningStrategy> winningStrategies) {
            this.winningStrategies = winningStrategies;
            return this;
        }

        public void validate(){
            // validate before starting a game
            // 1. check the players count == given number of players
            if((noOfPlayers == 1) || (players.size() > SymbolManager.uniqueSymbols) || (players.size() != noOfPlayers)){
                throw new RuntimeException("Invalid players count");
            }

            // 2. You can have only one Bot in the game
            int botCount = 0;
            for(Player player : players){
                if(player.getPlayerType().equals(PlayerType.BOT)){
                    botCount ++;
                }
            }
            if(botCount > 1) throw new RuntimeException("More than one bot is not allowed!");

            // 3. Every player should have a separate symbol
            Set<Character> symbolSet = new HashSet<>();

            for(Player player : players){
                if(symbolSet.contains(player.getSymbol().getSym())){
                    Character c = SymbolManager.getUniqueSymbol(symbolSet);

                    if(c == null){
                        throw new RuntimeException("No available symbols left");
                    }

                    player.getSymbol().setSym(c);
                }
                symbolSet.add(player.getSymbol().getSym());
            }
        }

        public Game build(){
            validate();
            return new Game(this);
        }
    }
}
