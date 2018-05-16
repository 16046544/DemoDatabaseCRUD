package sg.edu.rp.c346.p03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private static final  R = ;
    //Step 1: Declare the field variables
    TextView tvDisplay;
    Button btnDisplay;
    EditText etInput;
    ToggleButton tbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Step2
        tvDisplay = (TextView) findViewById(R.id.textViewDisplay);
        btnDisplay =(Button)findViewById(R.id.btnDisplay);
        etInput = (EditText)findViewById(R.id.editTextInput);
        tbtn =(ToggleButton) findViewById(R.id.toggleButton);

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for the action
                String input = etInput.getText().toString();
                tvDisplay.setText(input);

            }
        });


        tbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Add your Code for the action
                if(tbtn.isChecked()){
                    etInput.setEnabled(true);
                }
                else {
                    etInput.setEnabled(false);
                }

            }
        });

    }
}
