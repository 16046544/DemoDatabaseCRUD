package sg.edu.rp.c346.portfoliotest;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SubmitActivity extends AppCompatActivity {

    TextView textViewTitleSub;
    TextView textViewStorySub;
    Button buttonDone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit);

        textViewTitleSub = (TextView)findViewById(R.id.textViewTitleSub);
        textViewStorySub = (TextView)findViewById(R.id.textViewStorySub);
        buttonDone = (Button)findViewById(R.id.buttonDone);

        Intent intentReceived = getIntent();
        String title = intentReceived.getStringExtra("Title");
        String story = intentReceived.getStringExtra("Story");

        textViewTitleSub.setText(title);
        textViewStorySub.setText(story);

        buttonDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(),
                        MainActivity.class);
                startActivity(intent);
            }
        });
    }

}
