package com.appcodewithprachi.worrynot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class AnalysisSegregationQues extends AppCompatActivity {
    Button answer1, answer2, answer3, answer4;

    TextView score, question;
    private Questions mQuestions = new Questions();
    private String mAnswer;
    private int mScore = 0;
    private int mQuestionsLength = mQuestions.mQuestions.length;
    private String mAnswers[] = {"Bad","Always","Yes", "No", "Not a single day", "0%-25%","2-4 hours", "0%-20%","71%-100%"};
    Random r;
    Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analysis_segregation_ques);
        handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(AnalysisSegregationQues.this,Recommendation.class);
                startActivity(intent);
                finish();
            }
        },40000);
        r = new Random();
        answer1 = (Button) findViewById(R.id.answer1);
        answer2 = (Button) findViewById(R.id.answer2);
        answer3 = (Button) findViewById(R.id.answer3);
        answer4 = (Button) findViewById(R.id.answer4);

        score = (TextView) findViewById(R.id.score);
        question = (TextView) findViewById(R.id.question);
        score.setText("Stars: " + mScore);

        updateQuestion(r.nextInt(mQuestionsLength));



        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateQuestion(r.nextInt(mQuestionsLength));
                if (answer1.getText() == mAnswer) {
                    mScore++;
                    score.setText("Stars: " + mScore);

                }
            }


        });
        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateQuestion(r.nextInt(mQuestionsLength));
                if (answer2.getText() == mAnswer) {
                    mScore++;
                    score.setText("Stars: " + mScore);
                }
            }


        });
        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateQuestion(r.nextInt(mQuestionsLength));
                if (answer3.getText() == mAnswer) {
                    mScore++;
                    score.setText("Stars: " + mScore);
                }
            }


        });
        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateQuestion(r.nextInt(mQuestionsLength));
                if (answer4.getText() == mAnswer) {
                    mScore++;
                    score.setText("Stars: " + mScore);
                }
            }


        });
    }

    private void updateQuestion(int num) {
        question.setText(mQuestions.getQuestion(num));
        answer1.setText(mQuestions.getChoice1(num));
        answer2.setText(mQuestions.getChoice2(num));
        answer3.setText(mQuestions.getChoice3(num));
        answer4.setText(mQuestions.getChoice4(num));
        mAnswer = mQuestions.getCorrectAnswer(num);

    }


}