import abstractfactory.AbstractFactory;
import abstractfactory.FactoryProducer;
import abstractfactory.Gift;
import command.BikeCommand;
import command.Command;
import command.Controller;
import command.DollCommand;
import entities.Board;
import entities.Elf;
import entities.SantaClaus;

public class MainClass {
    public static void main(String[] args) {

        SantaClaus santaClaus = SantaClaus.getInstance();

        Board board = new Board();
        Controller controller = new Controller();

        Command dollCommand =  new DollCommand(board);
        Command bikeCommand = new BikeCommand(board);

        Elf elf = new Elf("Ivan");
        board.subscribe(elf);

        controller.setCommand(dollCommand);
        controller.showCommandOnBoard();

        controller.setCommand(bikeCommand);
        controller.showCommandOnBoard();


        AbstractFactory giftFactory = FactoryProducer.getFactory("GIFT");

        Gift doll = giftFactory.getGift("DOLL");
        doll.get();

        Gift bike = giftFactory.getGift("BIKE");
        bike.get();

    }
}
