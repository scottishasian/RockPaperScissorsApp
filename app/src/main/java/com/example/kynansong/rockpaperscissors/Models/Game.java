package com.example.kynansong.rockpaperscissors.Models;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Random;

/**
 * Created by kynansong on 15/11/2017.
 */

public class Game {


    String[] moves;
    Rules rules;

    public Game() {
        this.moves = new String[3];
        this.rules = new Rules();
    }

    public String computerMove() {
        moves = new String[] {"Rock", "Paper", "Scissors"};
        int choice = new Random().nextInt(moves.length);
        return moves[choice];
    }

    public String gameLogic(String playerMove) {

        String computerMove = computerMove();

        if(this.rules.getRules().get(playerMove).equals(computerMove) ) {
            return "Player wins with: " + playerMove;
        } else if(this.rules.getRules().get(computerMove).equals(computerMove)) {
            return "computer wins: " + computerMove;
        } else {
            return "draw";
        }


    }
}
