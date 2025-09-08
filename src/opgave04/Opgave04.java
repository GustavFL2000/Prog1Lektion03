package opgave04;
import java.util.Random;
import java.util.Scanner;

public class Opgave04 {

    public static String game(int hand){
        switch(hand) {
    case 0:
    return "Rock";
    case 1:
    return "Paper";
    case 2:
    return "Scissors";
    default:
    return "That is not a valid hand";
}
    }
    public static void main(String[] args) {
        while(true){
        //Spiller vælger hånd
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vælg din hånd (0=Rock, 1=Paper, 2=Scissors): ");
        int userHand = scanner.nextInt();
        System.out.print("Spiller har valgt: ");
        System.out.println(game(userHand));

        //Computer vælger hånd
        Random random = new Random();
        int hand = random.nextInt(3);
        System.out.print("Computer har valgt: ");
        System.out.println(game(hand));

        //Bestem vinder
        if (userHand == hand) {
            System.out.println("It's a tie!");
        } else if ((userHand == 0 && hand == 2) || (userHand == 1 && hand == 0) || (userHand == 2 && hand == 1)) {
            System.out.println("You win!");
        } else if ((userHand == 0 && hand == 1) || (userHand == 1 && hand == 2) || (userHand == 2 && hand == 0)) {
            System.out.println("Computer wins!");
        } else {
            System.out.println("Invalid input. Please enter 0, 1, or 2.");
        }
    }
    }
}
