package command;

import entities.Board;

public class DollCommand implements Command{

    private Board board;

    public DollCommand(Board board) {
        this.board = board;
    }

    @Override
    public void execute() {
        this.board.showDollOnBoard();
    }
}
