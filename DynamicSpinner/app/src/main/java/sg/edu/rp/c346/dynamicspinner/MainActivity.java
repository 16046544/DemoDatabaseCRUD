package sg.edu.rp.c346.dynamicspinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    //step 1a define variable
    Spinner spn1;
    Spinner spn2;
    Button btnUpdate;

    //step 1b define array and AA
    ArrayList<String> alNumbers = new ArrayList<String>();
    ArrayAdapter<String> aaNumbers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //step 2 bind variable to element
        spn1=(Spinner)findViewById(R.id.spinner1);
        spn2=(Spinner)findViewById(R.id.spinner2);
        btnUpdate=(Button)findViewById(R.id.buttonUpdate);

        //step3 create AA using default spinner layout and arraylist
        aaNumbers=new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, alNumbers);

        //bind AA to spinner
        spn2.setAdapter(aaNumbers);

        //step 4 change spn 2 when button clicks
        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
                    public void onClick(View v) {
                int pos = spn1.getSelectedItemPosition();
                alNumbers.clear();
                if (pos==0) {
                    String[] strNumbers = getResources().getStringArray(R.array.even_number);
                    alNumbers.addAll(Arrays.asList(strNumbers));
                }
                else {
                    String[] strNumbers = getResources().getStringArray(R.array.odd_number);
                    alNumbers.addAll(Arrays.asList(strNumbers));
                }
                aaNumbers.notifyDataSetChanged();
            }
        });

        spn1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                int pos = spn1.getSelectedItemPosition();
                alNumbers.clear();
                if (pos==0) {
                    String[] strNumbers = getResources().getStringArray(R.array.even_number);
                    alNumbers.addAll(Arrays.asList(strNumbers));
                    spn2.setSelection(2); //6 is at position 2
                }
                else {
                    String[] strNumbers = getResources().getStringArray(R.array.odd_number);
                    alNumbers.addAll(Arrays.asList(strNumbers));
                    spn2.setSelection(1);
                }
                aaNumbers.notifyDataSetChanged();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
