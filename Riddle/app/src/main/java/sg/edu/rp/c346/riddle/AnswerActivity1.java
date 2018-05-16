package sg.edu.rp.c346.riddle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity1 extends AppCompatActivity {
    TextView tvAnswer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer1);
        tvAnswer = (TextView) findViewById(R.id.textViewA1);
        Intent intentReceived = getIntent();
        String questionsSelected = intentReceived.getStringExtra("Question");
        if(questionsSelected.equals("Q1")) {
            tvAnswer.setText(questionsSelected + " answer is: Queue");
        }else{
            tvAnswer.setText(questionsSelected + " answer is: Gone");
        }
    }
}