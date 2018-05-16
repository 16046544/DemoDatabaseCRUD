package sg.edu.rp.c346.firstlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // step 1a
    ListView lvFaciName;

    // step 2
    ArrayList<String> alFaciName = new ArrayList<String>();
    ArrayAdapter<String> aaFaciName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // step 1b
        lvFaciName = (ListView)findViewById(R.id.lvFaciName);
        // step 3: add data into the list
        alFaciName.add("Yow Hon Kong");
        alFaciName.add("Wong Wai Ling");


        aaFaciName = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,alFaciName);
        lvFaciName.setAdapter(aaFaciName);
    }
}
