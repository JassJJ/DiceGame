package Game;

import java.util.Random;

public class PlayerLogic {
    private String player;
    private int tempScore=0;

    private int score;


    public void setPlayer(String player) {
        this.player = player;

    }
    public String getPlayer() {
       return player;
    }


    public int throwDice() {
        Random random = new Random();
        int randomNum = random.nextInt(6);
        randomNum= randomNum+1;
        return randomNum;
    }

    public void setTempScore(int dice) {
        tempScore= tempScore + dice;
    }

    public int getTempScore() {
        return tempScore;
    }

    public void addToScore() {
        score= score + tempScore;
        tempScore=0;

    }

    public int getScore() {
        return score;
    }

    public void deleteTempScore() {
        tempScore= 0;
    }



}
