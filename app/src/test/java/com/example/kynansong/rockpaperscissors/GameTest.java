package com.example.kynansong.rockpaperscissors;

import com.example.kynansong.rockpaperscissors.Models.Game;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

/**
 * Created by kynansong on 15/11/2017.
 */

public class GameTest {

    Game game;

    @Before
    public void before() {
        game = new Game();

    }

    @Test
    public void testComputerCanMove() {
        assertNotNull(game.computerMove());
    }



//    @Test
//    public void testCanWin() {
//        assertEquals("Rock beats Scissors", game.gameLogic("Rock", "Scissors"));
//    }
//
//    @Test //passes
//    public void testCanDraw() {
//        assertEquals("It is a draw", game.gameLogic("Rock"));
//    }
//
//    @Test
//    public void testCanLose() {
//        assertEquals("Scissors beats Paper", game.gameLogic("Paper", "Scissors"));
//    }

}
