package com.example.android.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamAScore = 0;
    int teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void teamA3Add (View view){
        teamAScore = teamAScore + 3;
        displayForTeamA(teamAScore);
    }

    public void teamA2Add (View view){
        teamAScore = teamAScore + 2;
        displayForTeamA(teamAScore);
    }

    public void teamAFreethrow (View view){
        teamAScore = teamAScore + 1;
        displayForTeamA(teamAScore);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void teamB3Add (View view){
        teamBScore = teamBScore + 3;
        displayForTeamB(teamBScore);
    }

    public void teamB2Add (View view){
        teamBScore = teamBScore + 2;
        displayForTeamB(teamBScore);
    }

    public void teamBFreethrow (View view){
        teamBScore = teamBScore + 1;
        displayForTeamB(teamBScore);
    }

    public void resetScore (View view){
        teamAScore = 0;
        teamBScore = 0;
        displayForTeamA(teamAScore);
        displayForTeamB(teamBScore);
    }
}
