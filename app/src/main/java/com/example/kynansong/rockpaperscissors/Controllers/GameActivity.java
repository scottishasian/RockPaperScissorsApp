package com.example.kynansong.rockpaperscissors.Controllers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.kynansong.rockpaperscissors.Models.Game;
import com.example.kynansong.rockpaperscissors.R;

public class GameActivity extends AppCompatActivity {

    private Button rockbutton;
    private Button paperbutton;
    private Button scissorsbutton;
    private String rock;
    private String paper;
    private String scissors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        this.rockbutton = (Button) findViewById(R.id.rock_button);
        this.paperbutton = (Button) findViewById(R.id.paper_button);
        this.scissorsbutton = (Button) findViewById(R.id.scissors_button);
        this.rock = "Rock";
        this.paper = "Paper";
        this.scissors = "Scissors";
    }

    public void onButtonClickRock(View button) {
        playGame(this.rock);


    }

    public void onButtonClickPaper(View button) {
        playGame(this.paper);


    }

    public void onButtonClickScissors(View button) {


        playGame(this.scissors);

      }

    public void playGame (String gameMove) {

        Intent intent = new Intent(this, ResultsActivity.class);

        Game game = new Game();

        String playerMove = game.gameLogic(gameMove);

        intent.putExtra("play", playerMove);

        startActivity(intent);

    }



}
