package command;

public class Controller {

    private Command command;

    public void setCommand(Command command)
    {
        this.command = command;
    }

    public void showCommandOnBoard() {
        if (this.command == null) {
            System.out.println("No command set");
            return;
        }

        this.command.execute();
    }
}
