package Game;

import java.util.Scanner;

public class MainGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        PlayerLogic player1 = new PlayerLogic();
        PlayerLogic player2 = new PlayerLogic();
        System.out.println("welcome to the dice game please write the name of player 1");
        player1.setPlayer(scan.nextLine());
        System.out.println("now write the name of player 2");
        player2.setPlayer(scan.nextLine());
        System.out.println("welcome "+ player1.getPlayer()+" and "+ player2.getPlayer());
        System.out.println("bla bla game rules");

        while (player1.getScore()<=50||player2.getScore()<=50) {
            int dice;
            while(true) {//player 1
                System.out.println("its "+ player1.getPlayer()+" turn");
                System.out.println("do you want to throw the dice write 1 if you want to stop your turn and save your score write 2");
                System.out.println("right now your score is: " + player1.getTempScore());
                int input = Integer.parseInt(scan.nextLine());
                switch (input) {
                    case 1:
                        dice = player1.throwDice();
                        if (dice == 1) {
                            System.out.println("you gott " + dice);
                            System.out.println("sorry you lost all you points");
                            player1.deleteTempScore();
                            return;
                        } else {
                            player1.setTempScore(dice);
                            System.out.println("you gott " + dice);
                            System.out.println("your current score is " + player1.getTempScore());
                            break;
                        }
                    case 2:
                        player1.addToScore();
                        System.out.println("you saved your score");
                        System.out.println("your current score is " + player1.getScore());
                        return;
                }



            }//
            
        }
        System.out.println("you gott 50!");
    }
}
