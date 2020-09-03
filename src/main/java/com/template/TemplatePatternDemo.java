package com.template;

public class TemplatePatternDemo {
    public static void main(String[] args) {
        CricketGame cricketGame = new CricketGame();
        FootballGame footballGame = new FootballGame();

        cricketGame.play();
        footballGame.play();
    }
}
