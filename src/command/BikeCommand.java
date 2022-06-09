package command;

import entities.Board;

public class BikeCommand implements Command{

    private Board board;

    public BikeCommand(Board board) {
        this.board = board;
    }

    @Override
    public void execute() {
        this.board.showBikeOnBoard();
    }
}
