package com.bendtherulez.tichucounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.bendtherulez.tichucounter.R;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

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

    //method for adding teamA tichu
    public void addTichuForTeamA(View v) {
        scoreTeamA = scoreTeamA + 100;
        displayForTeamA(scoreTeamA);
    }

    //method for subtracting teamA tichu
    public void minusTichuForTeamA(View v) {
        scoreTeamA = scoreTeamA - 100;
        displayForTeamA(scoreTeamA);
    }

    //method for adding teamA Grande Tichu
    public void addGrandeForTeamA(View v) {
        scoreTeamA = scoreTeamA + 200;
        displayForTeamA(scoreTeamA);
    }

    //subtracting team A grande tichu
    public void minusGrandeForTeamA(View v) {
        scoreTeamA = scoreTeamA - 200;
        displayForTeamA(scoreTeamA);
    }

    //method for team A 1-2
    public void oneTwoTeamA(View v) {
        scoreTeamA = scoreTeamA + 200;
        displayForTeamA(scoreTeamA);
    }

    //adding dragon points teamA
    public void dragonTeamA(View v) {
        scoreTeamA = scoreTeamA + 25;
        displayForTeamA(scoreTeamA);
    }

    //subtracting phoenix points team A
    public void phoenixTeamA(View v) {
        scoreTeamA = scoreTeamA - 25;
        displayForTeamA(scoreTeamA);
    }

    //adding points for fives for teamA
    public void fivesForTeamA(View v) {
        scoreTeamA = scoreTeamA + 5;
        displayForTeamA(scoreTeamA);
    }

    //adding points for tens and kings for team A
    public void tensKingsForTeamA(View v) {
        scoreTeamA = scoreTeamA +10;
        displayForTeamA(scoreTeamA);
    }

    //display method for team B
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    //method for adding teamB tichu
    public void addTichuForTeamB(View v) {
        scoreTeamB = scoreTeamB + 100;
        displayForTeamB(scoreTeamB);
    }

    //method for subtracting teamB tichu
    public void minusTichuForTeamB(View v) {
        scoreTeamB = scoreTeamB - 100;
        displayForTeamB(scoreTeamB);
    }

    //method for adding teamB Grande Tichu
    public void addGrandeForTeamB(View v) {
        scoreTeamB = scoreTeamB + 200;
        displayForTeamB(scoreTeamB);
    }

    //subtracting team B grande tichu
    public void minusGrandeForTeamB(View v) {
        scoreTeamB = scoreTeamB - 200;
        displayForTeamB(scoreTeamB);
    }

    //method for team B 1-2
    public void oneTwoTeamB(View v) {
        scoreTeamB = scoreTeamB + 200;
        displayForTeamB(scoreTeamB);
    }

    //adding dragon points teamB
    public void dragonTeamB(View v) {
        scoreTeamB = scoreTeamB + 25;
        displayForTeamB(scoreTeamB);
    }

    //subtracting phoenix points team B
    public void phoenixTeamB(View v) {
        scoreTeamB = scoreTeamB - 25;
        displayForTeamB(scoreTeamB);
    }

    //adding points for fives for teamB
    public void fivesForTeamB(View v) {
        scoreTeamB = scoreTeamB + 5;
        displayForTeamB(scoreTeamB);
    }

    //adding points for tens and kings for team B
    public void tensKingsForTeamB(View v) {
        scoreTeamB = scoreTeamB +10;
        displayForTeamB(scoreTeamB);
    }

    //method for reseting score in new game
    public void newGame(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

}
