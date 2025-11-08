
import java.util.Random;

public class RockPaperScissor {

    private Random random;

    private String rock = """
        _______
    ---'   ____)
          (_____)
          (_____)
          (____)
    ---.__(___)
    """;
    private String paper = """
        _______
    ---'   ____)____
              ______)
              _______)
            _______)
    ---.__________)
    """;
    private String scissors = """
        _______
    ---'   ____)____
              ______)
           __________)
          (____)
    ---.__(___)
    """;

    public RockPaperScissor() {
        this.random = new Random();
    }

    // Prints the ASCII art for the game.
    public void options() {
        System.out.println("Pick one by writing rock/paper/scissors: ");

        System.out.println("Rock: ");
        System.out.print(this.scissors);
        
        System.out.println("");
        
        System.out.println("Paper: ");
        System.out.print(this.paper);
        
        System.out.println("");

        System.out.println("Scissors: ");
        System.out.print(this.scissors);
    }

    public String getRock() {
        return this.rock;
    }

    public String getPaper() {
        return this.paper;
    }

    public String getScissors() {
        return this.scissors;
    }

    // Random number generator for the computer.
    public int randomChoice() {
        int randNum = random.nextInt(3);

        if (randNum == 0) {
            return 0;
        } else if(randNum == 1) {
            return 1;
        } else if (randNum == 2) {
            return 2;
        }

        return 0;
    }
}
