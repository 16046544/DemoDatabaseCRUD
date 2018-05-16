package sg.edu.rp.c346.timeanddate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    private static final R = ;

    TimePicker tp;
    DatePicker dp;
    Button btnDate;
    Button btnTime;
    TextView tvDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tp = (TimePicker) findViewById(R.id.tp);
        dp = (DatePicker) findViewById(R.id.dp);
        btnDate = (Button) findViewById(R.id.btnDate);
        btnTime = (Button) findViewById(R.id.btnTime);
        tvDisplay = (TextView) findViewById(R.id.tvDisplay);
    }
}
