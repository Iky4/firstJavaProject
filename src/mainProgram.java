
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        RockPaperScissor rps = new RockPaperScissor();

        UserInterface ui = new UserInterface(scan, rps);

        ui.start();
    }
}
