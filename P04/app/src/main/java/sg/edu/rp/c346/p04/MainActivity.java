package sg.edu.rp.c346.p04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "activity_main";

    TextView tvDisplay;
    ToggleButton tbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("activity_main", "tbtn.onClick()");
        tvDisplay = (TextView) findViewById(R.id.editTextName);
        tbtn =(ToggleButton) findViewById(R.id.toggleButtonControl);

        tbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Add your Code for the action
                if(tbtn.isChecked()){
                    tvDisplay.setEnabled(true);
                }
                else {
                    tvDisplay.setEnabled(false);
                }

            }
        });
    }
}
