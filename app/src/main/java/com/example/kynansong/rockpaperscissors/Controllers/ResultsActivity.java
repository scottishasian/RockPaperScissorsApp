package com.example.kynansong.rockpaperscissors.Controllers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.kynansong.rockpaperscissors.R;

public class ResultsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        Intent intent = getIntent();

        Bundle extras = intent.getExtras();

        String gameMove = extras.getString("play");
//        String paperMove = extras.getString("paper");
//        String scissorsMove = extras.getString("scissors");


        TextView ResultTextView = findViewById(R.id.result_message);
//        TextView PaperTextView = findViewById(R.id.result_message);
//        TextView ScissorsTextView = findViewById(R.id.result_message);

        ResultTextView.setText(gameMove);
//        PaperTextView.setText(paperMove);
//        ScissorsTextView.setText(scissorsMove);

    }
}

