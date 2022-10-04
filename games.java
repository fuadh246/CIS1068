
/*
 * Name: Fuad Hassan
 * Lab: 04
 * Date: 09/26/2022
*/
import java.util.Arrays;
import java.util.Scanner;

/*
 * game: dicription 
 * During each round, players choose a move, which may be either Skadis, Tjusig, Klyket, Hovolm, or Pershult. The rules are:
 *  Pershult beats Klyket, Skadis
 * Klyket beats Tjusig, Hovolm
 * Tjusig beats Pershult, Skadis
 * Skadis Beats Hovolm, Klyket
 * Hovolm beats Pershult, Tjusig
 * 
 * The computer wins in the event of a tie.
*/

public class games {
    public static Scanner CONSOLE = new Scanner(System.in);

    public static void main(String[] args) {
        boolean PlayAgain = false;
        String Computer_pick;
        String Player_pick;
        String Winner_is;
        int[] result;
        int Total_game = 0;
        int Computer_win = 0;
        int Player_win = 0;
        System.out.println("Welcome to Uppföra game");
        // do while loop to continue the game until entered q or quit
        do {
            Player_pick = Player_pick();
            Computer_pick = Computer_pick();
            Winner_is = Cheak_winner(Computer_pick, Player_pick);
            Print_winner(Computer_pick, Player_pick, Winner_is);
            System.out.println();
            result = record(Winner_is);
            Total_game += result[0];
            Computer_win += result[1];
            Player_win += result[2];
            System.out.println("Do you want to play the game again? if yes enter y and if no enter n ");
            String User_play = CONSOLE.nextLine();
            while ((!User_play.equals("y")) && (!User_play.equals("n"))) {
                System.out.println(User_play);
                System.out.println("invalid input!");
                User_play = CONSOLE.nextLine();
            }
            if (User_play.equals("y")) {
                PlayAgain = true;
            } else {
                PlayAgain = false;
            }
        } while (PlayAgain != false);
        System.out
                .println("Total game played " + Total_game + " computer won " + Computer_win + " you won" + Player_win);

    }

    // @function: Ask the user to pick one until input is valid (scanner)
    public static String Player_pick() {
        String[] moves = new String[] { "skadis", "tjusig", "klyket", "hovolm", "pershult" };
        System.out.println("Please pick your move from " + Arrays.toString(moves));
        String User_input = CONSOLE.nextLine();
        while (!Arrays.toString(moves).contains(User_input.toLowerCase())) {
            System.out.println("your move is invalid!");
            System.out.println("Please pick your move from " + Arrays.toString(moves));
            User_input = CONSOLE.nextLine();
        }
        return User_input.toLowerCase();
    }

    // @function: The computer picks one from the array randomly
    public static String Computer_pick() {
        String[] moves = new String[] { "skadis", "tjusig", "klyket", "hovolm", "pershult" };
        int i = (int) (Math.random() * 4);
        return moves[i];
    }

    // @function: to check the winner
    public static String Cheak_winner(String Computer_pick, String Player_pick) {
        if (Computer_pick.equals(Player_pick)) {
            // If the game is tie computer wins
            return "Computer";
        } else if (Computer_pick.equals("pershult") && (Player_pick.equals("klyket") || Player_pick.equals("skadis"))) {
            return "Computer";
        } else if (Computer_pick.equals("klyket") && (Player_pick.equals("tjusig") || Player_pick.equals("hovolm"))) {
            return "Computer";
        } else if (Computer_pick.equals("tjusig") && (Player_pick.equals("pershult") || Player_pick.equals("skadis"))) {
            return "Computer";
        } else if (Computer_pick.equals("skadis") && (Player_pick.equals("hovolm") || Player_pick.equals("klyket"))) {
            return "Computer";
        } else if (Computer_pick.equals("hovolm") && (Player_pick.equals("pershult") || Player_pick.equals("tjusig"))) {
            return "Computer";
        } else {
            return "Player";
        }
    }

    // @function: Print the winter
    public static void Print_winner(String Computer_pick, String Player_pick, String Winner_is) {
        System.out.println("You picked " + Player_pick + " and Computer picked " + Computer_pick);
        if (Winner_is.equals("Player")) {
            System.out.println("Winner of this round is you");
        } else {
            System.out.println("Winner of this round is Computer");
        }
    }

    // Store the winner counts
    public static int[] record(String Winner_is) {
        int Total_game = 0;
        int Computer_win = 0;
        int Player_win = 0;
        if (Winner_is.equals("Computer")) {
            Computer_win++;
            Total_game++;
        } else {
            Player_win++;
            Total_game++;
        }
        int[] result = { Total_game, Computer_win, Player_win };
        return result;
    }

}