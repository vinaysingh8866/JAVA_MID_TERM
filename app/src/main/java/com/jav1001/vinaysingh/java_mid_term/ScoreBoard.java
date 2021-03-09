package com.jav1001.vinaysingh.java_mid_term;

import android.content.Intent;
import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ScoreBoard extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_board);
        Intent intent = getIntent();
        String team1Name = intent.getStringExtra(MainActivity._team1Name);
        String team2Name = intent.getStringExtra(MainActivity._team2Name);
        TextView textViewTeam1 = findViewById(R.id.textViewTeam1);
        textViewTeam1.setText(team1Name);
        TextView textViewTeam2 = findViewById(R.id.textViewTeam2);
        textViewTeam2.setText(team2Name);

        Spinner spinnerGames = findViewById(R.id.spinner_games);
        TextView team1Score = findViewById(R.id.team_1_score);
        Button team1Increase = findViewById(R.id.team_1_increase);

        team1Increase.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String game = spinnerGames.getSelectedItem().toString();
                int score  = Integer.parseInt(team1Score.getText().toString());
                if(game.equals("BasketBall")){
                    score+=1;
                }
                else {
                    score+=10;
                }
                team1Score.setText(""+score);


            }
        });

        Button team1Decreasse = findViewById(R.id.team_1_decrease);

        team1Decreasse.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                String game = spinnerGames.getSelectedItem().toString();
                int score  = Integer.parseInt(team1Score.getText().toString());
                if(game.equals("BasketBall")){
                    score-=1;
                }
                else {
                    score-=5;
                }
                team1Score.setText(""+score);


            }
        });

        TextView team2Score = findViewById(R.id.team_2_score);
        Button team2Increase = findViewById(R.id.team_2_increase);

        team2Increase.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                String game = spinnerGames.getSelectedItem().toString();
                int score  = Integer.parseInt(team2Score.getText().toString());
                System.out.println(game);
                if(game.equals("BasketBall")){
                    score+=1;
                }
                else {
                    score+=10;
                }
                team2Score.setText(""+score);


            }
        });

        Button team2Decreasse = findViewById(R.id.team_2_decrease);

        team2Decreasse.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                String game = spinnerGames.getSelectedItem().toString();
                int score  = Integer.parseInt(team2Score.getText().toString());
                if(game.equals("BasketBall")){
                    score-=1;
                }
                else {
                    score-=5;
                }
                team2Score.setText(""+score);


            }
        });



    }

}