package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int ScoreTeamA=0;
    int ScoreTeamB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void addThreeForTeamA(View View){
        ScoreTeamA=ScoreTeamA+3;
        displayForTeamA(ScoreTeamA);
    }
    public void addTwoForTeamA(View View){
        ScoreTeamA=ScoreTeamA+2;
        displayForTeamA(ScoreTeamA);
    }
    public void addZeroForTeamA(View View){
        ScoreTeamA=ScoreTeamA+0;
        displayForTeamA(ScoreTeamA);
    }
    public void addThreeForTeamB(View View){
        ScoreTeamB=ScoreTeamB+3;
        displayForTeamB(ScoreTeamB);
    }
    public void addTwoForTeamB(View View){
        ScoreTeamB=ScoreTeamB+2;
        displayForTeamB(ScoreTeamB);
    }
    public void addZeroForTeamB(View View){
        ScoreTeamB=ScoreTeamB+0;
        displayForTeamB(ScoreTeamB);
    }
    public void ResetScore(View View){
        ScoreTeamA=0;
        ScoreTeamB=0;
        displayForTeamA(0);
        displayForTeamB(0);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

}
