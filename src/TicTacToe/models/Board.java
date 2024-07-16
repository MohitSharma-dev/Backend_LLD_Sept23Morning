package TicTacToe.models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private int size;
    private List<List<Cell>> grid;

    public Board(int noOfPlayers){
        this.size = noOfPlayers + 1;
        this.grid = new ArrayList<>();
        for(int i = 0; i < size; i++){
            grid.add(new ArrayList<>());
            for(int j = 0; j < size; j++){
                grid.get(i).add(new Cell(i , j));
            }
        }
    }
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<List<Cell>> getGrid() {
        return grid;
    }

    public void setGrid(List<List<Cell>> grid) {
        this.grid = grid;
    }

    public void display(){
        for(List<Cell> row : grid){
            for(Cell cell : row){
                cell.display();
            }
            System.out.println();
        }
    }

    public boolean isNotEmptyCell(int row, int col) {
        Cell selectedCell = grid.get(row).get(col);

        if(selectedCell.getCellState() != CellState.EMPTY){
            return true;
        }

        return false;
    }

    public Cell fillCellWithCurrentSymbol(int row, int col, Player currentPlayer) {
        Cell selectedCell = grid.get(row).get(col);
        selectedCell.updateCellStatus(currentPlayer.getSymbol(), CellState.FILLED);
        return selectedCell;
    }
}
