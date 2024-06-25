package com.example.cricketscorecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button one, two, three, four, five, six, wide, noball, dotball, convert, out;
    EditText score, ball, wicket;
    int run = 0;
    int balls = 0;
    int wickets = 0;
    float over = 0.0f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one=(Button)findViewById(R.id.OneRun);
        two=(Button)findViewById(R.id.TwoRun);
        three=(Button)findViewById(R.id.ThreeRun);
        four=(Button)findViewById(R.id.FourRun);
        five=(Button)findViewById(R.id.FiveRun);
        six=(Button)findViewById(R.id.SixRun);
        wide=(Button)findViewById(R.id.WideBall);
        noball=(Button)findViewById(R.id.NoBall);
        dotball=(Button)findViewById(R.id.ZeroRun);
        convert=(Button)findViewById(R.id.ConvertButton);
        out=(Button)findViewById(R.id.OutButton);
        score=(EditText)findViewById(R.id.ScoreTextBox);
        ball=(EditText)findViewById(R.id.BallTextBox);
        wicket=(EditText)findViewById(R.id.WicketTextBox);


        //Buttons Function
        //one run
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                run=run+1;
                score.setText(Integer.toString(run));
                balls=balls+1;
                ball.setText(Integer.toString(balls));
            }
        });


        //two run
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                run=run+2;
                score.setText(Integer.toString(run));
                balls=balls+1;
                ball.setText(Integer.toString(balls));
            }
        });

        //three run
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                run=run+3;
                score.setText(Integer.toString(run));
                balls=balls+1;
                ball.setText(Integer.toString(balls));
            }
        });

        //four run
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                run=run+4;
                score.setText(Integer.toString(run));
                balls=balls+1;
                ball.setText(Integer.toString(balls));
            }
        });

        //five run
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                run=run+5;
                score.setText(Integer.toString(run));
                balls=balls+1;
                ball.setText(Integer.toString(balls));
            }
        });


        //six runs
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                run=run+6;
                score.setText(Integer.toString(run));
                balls=balls+1;
                ball.setText(Integer.toString(balls));
            }
        });

        //wide ball
        wide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                run=run+1;
                score.setText(Integer.toString(run));
                balls=balls+0;
                ball.setText(Integer.toString(balls));
            }
        });

        //no ball
        noball.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                run=run+1;
                score.setText(Integer.toString(run));
                balls=balls+0;
                ball.setText(Integer.toString(balls));
            }
        });

        //dot ball
        dotball.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                run=run+0;
                score.setText(Integer.toString(run));
                balls=balls+1;
                ball.setText(Integer.toString(balls));
            }
        });

        //wickets
        out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wickets=wickets+1;
                wicket.setText(Integer.toString(wickets));
                balls=balls+1;
                ball.setText(Integer.toString(balls));
            }
        });

        //convert balls to over
        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String number=ball.getText().toString();
               int a = Integer.parseInt(number);
               int rem = a%6;
               int quotient = a/6;
               ball.setText((quotient+"."+rem));
            }
        });
    }
}