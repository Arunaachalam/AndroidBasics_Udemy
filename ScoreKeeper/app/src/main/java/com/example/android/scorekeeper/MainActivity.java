package com.example.android.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int teamAScore = 0;
    int teamBScore = 0;
    int wicketA = 0;
    int wicketB = 0;
    int ballsA = 0;
    int ballsB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score, int wicketA, int ballsA) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score) + "/" + String.valueOf(wicketA));

        TextView overView = (TextView) findViewById(R.id.oversA);
        overView.setText(String.valueOf(ballsA/6)+" overs "+String.valueOf(ballsA%6)+" balls");
    }

    public void teamA0score (View view){
        teamAScore = teamAScore + 0;
        ballsA = ballsA+1;
        displayForTeamA(teamAScore,wicketA,ballsA);
    }
    public void teamA1score (View view){
        teamAScore = teamAScore + 1;
        ballsA = ballsA+1;
        displayForTeamA(teamAScore,wicketA,ballsA);
    }
    public void teamA2score (View view){
        teamAScore = teamAScore + 2;
        ballsA = ballsA+1;
        displayForTeamA(teamAScore,wicketA,ballsA);
    }
    public void teamA3score (View view){
        teamAScore = teamAScore + 3;
        ballsA = ballsA+1;
        displayForTeamA(teamAScore,wicketA,ballsA);
    }
    public void teamA4score (View view){
        teamAScore = teamAScore + 4;
        ballsA = ballsA+1;
        displayForTeamA(teamAScore,wicketA,ballsA);
    }
    public void teamA6score (View view){
        teamAScore = teamAScore + 6;
        ballsA = ballsA+1;
        displayForTeamA(teamAScore,wicketA,ballsA);
    }
    public void teamAnoball (View view){
        teamAScore = teamAScore + 1;
        ballsA = ballsA-1;
        displayForTeamA(teamAScore,wicketA,ballsA);
    }
    public void teamAwide (View view){
        teamAScore = teamAScore + 1;
        ballsA = ballsA-1;
        displayForTeamA(teamAScore,wicketA,ballsA);
    }
    public void teamAout (View view){
        teamAScore = teamAScore + 0;
        wicketA = wicketA + 1;
        ballsA = ballsA+1;
        displayForTeamA(teamAScore,wicketA,ballsA);
    }


    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score, int wicketB, int ballsB) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score) + "/" + String.valueOf(wicketB));

        TextView overView = (TextView) findViewById(R.id.oversB);
        overView.setText(String.valueOf(ballsB/6)+" overs "+String.valueOf(ballsB%6)+" balls");
    }

    public void teamB0score (View view){
        teamBScore = teamBScore + 0;
        ballsB = ballsB+1;
        displayForTeamB(teamBScore,wicketB,ballsB);
    }
    public void teamB1score (View view){
        teamBScore = teamBScore + 1;
        ballsB = ballsB+1;
        displayForTeamB(teamBScore,wicketB,ballsB);
    }
    public void teamB2score (View view){
        teamBScore = teamBScore + 2;
        ballsB = ballsB+1;
        displayForTeamB(teamBScore,wicketB,ballsB);
    }
    public void teamB3score (View view){
        teamBScore = teamBScore + 3;
        ballsB = ballsB+1;
        displayForTeamB(teamBScore,wicketB,ballsB);
    }
    public void teamB4score (View view){
        teamBScore = teamBScore + 4;
        ballsB = ballsB+1;
        displayForTeamB(teamBScore,wicketB,ballsB);
    }
    public void teamB6score (View view){
        teamBScore = teamBScore + 6;
        ballsB = ballsB+1;
        displayForTeamB(teamBScore,wicketB,ballsB);
    }
    public void teamBnoball (View view){
        teamBScore = teamBScore + 1;
        ballsB = ballsB-1;
        displayForTeamB(teamBScore,wicketB,ballsB);
    }
    public void teamBwide (View view){
        teamBScore = teamBScore + 1;
        ballsB = ballsB-1;
        displayForTeamB(teamBScore,wicketB,ballsB);
    }
    public void teamBout (View view){
        teamBScore = teamBScore + 0;
        wicketB = wicketB + 1;
        ballsB = ballsB+1;
        displayForTeamB(teamBScore,wicketB,ballsB);
    }


    public void resetScore (View view){
        teamAScore = 0;
        teamBScore = 0;
        wicketA = 0;
        wicketB = 0;
        displayForTeamA(teamAScore, wicketA,ballsA);
        displayForTeamB(teamBScore,wicketB,ballsB);
    }
}
