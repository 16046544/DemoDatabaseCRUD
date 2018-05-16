package sg.edu.rp.c346.riddle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //step 1
    TextView tvQ1;
    Button btnQ1;
    TextView tvQ2;
    Button btnQ2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity","onCreate() called.");

        //step 2
        tvQ1 = (TextView)findViewById(R.id.textViewQ1);
        btnQ1 = (Button)findViewById(R.id.buttonQ1);
        tvQ2 = (TextView)findViewById(R.id.textViewQ2);
        btnQ2 = (Button)findViewById(R.id.buttonQ2);

        //step 3
        btnQ1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(),AnswerActivity1.class);
                intent.putExtra("Question","Q1");//String Question = "Q1";
                startActivity(intent);
            }
        });
        btnQ2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(),AnswerActivity1.class);
                intent.putExtra("Question","Q2");
                startActivity(intent);
            }
        });
    }

}
