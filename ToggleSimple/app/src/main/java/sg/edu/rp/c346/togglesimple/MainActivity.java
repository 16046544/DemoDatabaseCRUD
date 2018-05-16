package sg.edu.rp.c346.togglesimple;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    //step1
    ToggleButton toggleButtonGender;
    TextView textViewGender;
    Button buttonClick;
    ToggleButton toggleButtonYN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //step2
        toggleButtonGender = (ToggleButton) findViewById(R.id.toggleButtonGender);
        textViewGender = (TextView) findViewById(R.id.textViewGender);
        buttonClick = (Button) findViewById(R.id.buttonClick);
        toggleButtonYN = (ToggleButton) findViewById(R.id.toggleButtonYN);

        //step3
        toggleButtonGender.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked == true){
                    textViewGender.setText("Male");
                }
                else{
                    textViewGender.setText("Female");

                }
            }
        });

        buttonClick.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(), "W64G Click Me", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}
