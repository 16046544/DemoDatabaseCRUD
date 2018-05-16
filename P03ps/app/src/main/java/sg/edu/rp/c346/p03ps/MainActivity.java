package sg.edu.rp.c346.p03ps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    //Declare fields
    TextView dspBill;
    TextView dspPaxPay;
    Button btnSplit;
    Button btnReset;
    ToggleButton tsplit;
    ToggleButton tgst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
