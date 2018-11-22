package com.example.android.countscore;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int teamA = 0;
    int teamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);

    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamA);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamB);
        scoreView.setText(String.valueOf(score));
    }

    public void threePointsForA(View view) {
        teamA = teamA + 3;
        displayForTeamA(teamA);
    }

    public void twoPointsForA(View view) {
        teamA = teamA + 2;
        displayForTeamA(teamA);
    }

    public void onePointsForA(View view) {
        teamA = teamA + 1;
        displayForTeamA(teamA);
    }

    public void threePointsForB(View view) {
        teamB = teamB + 3;
        displayForTeamB(teamB);
    }

    public void twoPointsForB(View v) {
        teamB = teamB + 2;
        displayForTeamB(teamB);
    }

    public void onePointsForB(View view) {
        teamB = teamB + 1;
        displayForTeamB(teamB);
    }

    public void reset(View view) {
        teamA = 0;
        teamB = 0;
        displayForTeamA(0);
        displayForTeamB(0);
    }

}
