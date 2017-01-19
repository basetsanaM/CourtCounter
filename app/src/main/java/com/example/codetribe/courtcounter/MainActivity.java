package com.example.codetribe.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    int scoreTeamA=0;
    int scoreTeamB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     *Increase the score of team A by 3 points
     */
    public void addThreePointsA(View view)
    {
        scoreTeamA+=3;
        displayForTeamA(scoreTeamA);

    }
    /**
     *Increase the score of team B by 3 points
     */
    public void addThreePointsB(View view)
    {
        scoreTeamB+=3;
        displayForTeamB(scoreTeamB);
    }
    /**
     *Increase the score of team A by 2 points
     */
    public void addTwoPointsA(View view)
    {
        scoreTeamA+=2;
        displayForTeamA(scoreTeamA);

    }
    /**
     *Increase the score of team B by 2 points
     */
    public void addTwoPointsB(View view)
    {

        scoreTeamB+=2;
        displayForTeamB(scoreTeamB);
    }
    /**
     *Increase the score of team A by 1 point
     */
    public void addOnePointA(View view)
    {
        scoreTeamA+=1;
        displayForTeamA(scoreTeamA);

    }
    /**
     *Increase the score of team B by 1 point
     */
    public void addOnePointB(View view)
    {
        scoreTeamB+=1;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Resets the score for both teams back to 0.
     */
    public void resetScore(View view)
    {
        scoreTeamA=0;
        scoreTeamB=0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for team A
     */
    public void displayForTeamA(int score)
    {
        TextView scoreView=(TextView) findViewById(R.id.team_A_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for team B
     */
    public void displayForTeamB(int score)
    {
        TextView scoreView=(TextView) findViewById(R.id.team_B_score);
        scoreView.setText(String.valueOf(score));
    }
}
