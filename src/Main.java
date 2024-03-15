import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String sentinel;
        Scanner scan = new Scanner(System.in);
        Player playerA = new Player();
        Player playerB = new Player();
        do {
            System.out.println("Player A: Choose your move!");
            playerA.move = scan.nextLine().toUpperCase();
            while (!(playerA.move.equals("R")  || playerA.move.equals("P") || playerA.move.equals("S"))){
                System.out.println("Invalid Move!");
                System.out.println("Player A: Choose your move!");
                playerA.move = scan.nextLine().toUpperCase();
            }
            System.out.println("Player B: Choose your move!");
            playerB.move = scan.nextLine().toUpperCase();
            while (!(playerB.move.equals("R")  || playerB.move.equals("P") || playerB.move.equals("S"))){
                System.out.println("Invalid Move!");
                System.out.println("Player B: Choose your move!");
                playerB.move = scan.nextLine().toUpperCase();
            }
            // Rock Breaks Scissors
            if (playerB.move.equals("R") && playerA.move.equals("S")) {
                playerB.win = true;
                System.out.println("Rock Breaks Scissors!");
            } else if (playerA.move.equals("R") && playerB.move.equals("S")) {
                playerA.win = true;
                System.out.println("Rock Breaks Scissors!");
            }
            // Paper covers Rock
            else if (playerB.move.equals("P") && playerA.move.equals("R")) {
                playerB.win = true;
                System.out.println("Paper Covers Rock");
            } else if (playerA.move.equals("P") && playerB.move.equals("R")) {
                playerA.win = true;
                System.out.println("Paper Covers Rock!");
            }
            // Scissors cuts Paper
            else if (playerB.move.equals("S") && playerA.move.equals("P")) {
                playerB.win = true;
                System.out.println("Scissors Cuts Paper!");
            } else {
                playerA.win = true;
                System.out.println("Scissors Cuts Paper!");
            }
            // Determine Winner
            if (playerA.win)
                System.out.println("Player A Wins!");
            else
                System.out.println("Player B Wins!");
            System.out.println("Play Again? (Y/N)");
            do {
                sentinel = scan.nextLine().toUpperCase();
                if (!(sentinel.equals("Y") || sentinel.equals("N")))
                    System.out.println("Invalid Command!");
            } while (!(sentinel.equals("Y") || sentinel.equals("N")));
        } while (sentinel.equals("Y"));
    }
}