package com.henry;

public class Main {

    public static void main(String[] args) {
        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println(highScore);
        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println(highScore);

        displayHighScorePosition("joe1", calculateHighScorePosition(2000));
        displayHighScorePosition("joe2", calculateHighScorePosition(877));
        displayHighScorePosition("joe3", calculateHighScorePosition(123));
        displayHighScorePosition("joe4", calculateHighScorePosition(8));
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name +
                " managed to get into position " +
                position + " on the high score table");
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500 && score < 1000) {
            return 2;
        } else if (score >= 100 && score < 500) {
            return 3;
        } else {
            return 4;
        }
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }
}
