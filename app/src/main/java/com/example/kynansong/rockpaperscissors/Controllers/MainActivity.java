package com.example.kynansong.rockpaperscissors.Controllers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.kynansong.rockpaperscissors.Models.Game;
import com.example.kynansong.rockpaperscissors.R;

public class MainActivity extends AppCompatActivity {

    private Button toGameButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.toGameButton = (Button) findViewById(R.id.to_game_button);
    }

    public void onButtonClick(View button) {

        Intent intent = new Intent(this, GameActivity.class);
        startActivity(intent);
    }

}
