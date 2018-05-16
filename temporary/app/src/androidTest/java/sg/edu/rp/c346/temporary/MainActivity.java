package sg.edu.rp.c346.simpletodo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText etElement;
    Button btnAdd;
    Button btnClear;
    ListView lvItem;
    ArrayList<String> alItem = new ArrayList<String>();
    ArrayAdapter<String> aalItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etElement = (EditText) findViewById(R.id.editTextItem);
        btnAdd = (Button) findViewById(R.id.buttonAddItem);
        btnClear = (Button) findViewById(R.id.buttonClearItem);
        lvItem = (ListView) findViewById(R.id.ListViewItem);

        aalItem = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, alItem);
        lvItem.setAdapter(aalItem);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String colour = etElement.getText().toString();
                alItem.add(colour);
                aalItem.notifyDataSetChanged();
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String colour = etElement.getText().toString();
                alItem.clear();
                aalItem.notifyDataSetChanged();
            }
        });
    }
}
