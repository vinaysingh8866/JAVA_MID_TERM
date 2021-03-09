package com.jav1001.vinaysingh.java_mid_term;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    public static final String _team1Name = "team1";
    public static final String _team2Name = "team2";

    private EditText editTextTeam1;
    private EditText editTextTeam2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextTeam1 = findViewById(R.id.editTextTeam1);
        editTextTeam2 = findViewById(R.id.editTextTeam2);

    }

    public void launchSecondActivity(View view) {
        String team1Name = editTextTeam1.getText().toString();
        String team2Name = editTextTeam2.getText().toString();

        Intent intent = new Intent(this,ScoreBoard.class);
        intent.putExtra(_team1Name, team1Name);
        intent.putExtra(_team2Name, team2Name);

        startActivity(intent);


    }
}