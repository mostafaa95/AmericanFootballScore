package com.example.android.americanfootball;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

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
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void touchDownA(View view) {
        scoreTeamA += 6;
        displayForTeamA(scoreTeamA);
    }

    public void extraPointsA(View view) {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    public void fieldGoalA(View view) {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    public void safetyA(View view) {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void touchDownB(View view) {
        scoreTeamB += 6;
        displayForTeamB(scoreTeamB);
    }

    public void extraPointsB(View view) {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    public void fieldGoalB(View view) {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    public void safetyB(View view) {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    public void reset(View view) {
        scoreTeamB = 0;
        scoreTeamA = 0;
        displayForTeamB(scoreTeamB);
        displayForTeamA(scoreTeamA);

    }
}
