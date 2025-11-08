
import java.util.Scanner;

public class UserInterface {

    private Scanner scan;
    private RockPaperScissor rps;

    public UserInterface(Scanner scan, RockPaperScissor rps) {
        this.scan = scan;
        this.rps = rps;
    }

    // Main method which starts the game. Checks for invalid inputs and prints out the valid options for the user.
    public void start() {
        this.rps.options();

        while(true) {
            System.out.println("What do you wanna pick? ('q' stops the game) ");

            String choice = this.scan.nextLine();

            if (choice.equals("q")) {
                break;
            } else if (!(choice.equals("rock") || choice.equals("paper") || choice.equals("scissors")) ) {
                System.out.print("That is not a valid option. These are your options: ");
                this.rps.options();
            } else {
                choose(choice); 
            }
        }
    }

    /* Takes in a string input from the user which triggers the if-else-if code block. The code block checks 
    if the input from the user equals to "rock", "paper" or "scissors". After which it checks the random
    number generated for the computer and prints either "rock", "paper" or "scissors" based on the integer value.
    */
    public void choose(String choice) {
        int computerChose = this.rps.randomChoice();
        
        if (choice.equals("rock")) {
            System.out.println("You chose: ");
            System.out.println(this.rps.getRock());
            
            if (computerChose == 0) {
                System.out.println("Computer chose: ");
                System.out.println(this.rps.getPaper());
                System.out.println("You lose...");
            } else if (computerChose == 1) {
                System.out.println("Computer chose: ");
                System.out.println(this.rps.getScissors());
                System.out.println("You win :-)");
            } else if (computerChose == 2) {
                System.out.println("Computer chose: ");
                System.out.println(this.rps.getRock());
                System.out.println("Draw :|");
            }
        } else if (choice.equals("paper")) {
            System.out.println("You chose: ");
            System.out.println(this.rps.getPaper());
            
            if (computerChose == 0) {
                System.out.println("Computer chose: ");
                System.out.println(this.rps.getPaper());
                System.out.println("Draw :|");
            } else if (computerChose == 1) {
                System.out.println("Computer chose: ");
                System.out.println(this.rps.getScissors());
                System.out.println("You lose...");
            } else if (computerChose == 2) {
                System.out.println("Computer chose: ");
                System.out.println(this.rps.getRock());
                System.out.println("You win :-)");
            }
        } else if (choice.equals("scissors")) {
            System.out.println("You chose: ");
            System.out.println(this.rps.getScissors());
            
            if (computerChose == 0) {
                System.out.println("Computer chose: ");
                System.out.println(this.rps.getPaper());
                System.out.println("You win :-)");
            } else if (computerChose == 1) {
                System.out.println("Computer chose: ");
                System.out.println(this.rps.getScissors());
                System.out.println("Draw :|");
            } else if (computerChose == 2) {
                System.out.println("Computer chose: ");
                System.out.println(this.rps.getRock());
                System.out.println("You lose...");
            }
        }
    }
}
