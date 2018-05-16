package sg.edu.rp.c346.p06quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import static sg.edu.rp.c346.p06quiz.R.id.editTextw;

public class Main2Activity extends AppCompatActivity {

    TextView tvDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        tvDisplay = (TextView)findViewById(R.id.textView2);
        Intent intentReceived = getIntent();
        String display = intentReceived.getStringExtra("comment is");
        tvDisplay.setText(display);
    }
}
