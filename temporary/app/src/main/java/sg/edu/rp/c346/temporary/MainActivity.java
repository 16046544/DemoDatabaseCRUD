package sg.edu.rp.c346.mycolourlist;
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
    Button btnDelete;
    Button btnChange;
    ListView lvColour;
    EditText etIndexElement;

    ArrayList <String> alColours = new ArrayList<String>();
    ArrayAdapter<String> aaColour;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etElement = (EditText) findViewById(R.id.editTextColour);
        btnAdd = (Button) findViewById(R.id.buttonAddItem);
        lvColour = (ListView) findViewById(R.id.ListViewColour);
        etIndexElement = (EditText) findViewById(R.id.editTextIndex);
        btnDelete = (Button) findViewById(R.id.buttonDeleteItem);
        btnChange = (Button) findViewById(R.id.buttonChangeColour);

        alColours.add("Red");
        alColours.add("Orange");
        aaColour = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, alColours);
        lvColour.setAdapter(aaColour);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String colour = etElement.getText().toString();
                int pos = Integer.parseInt(etIndexElement.getText().toString());
                alColours.add(pos, colour);
                aaColour.notifyDataSetChanged();
            }
        });
        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String colour = etElement.getText().toString();
                int pos = Integer.parseInt(etIndexElement.getText().toString());
                alColours.remove(pos);
                aaColour.notifyDataSetChanged();
            }
        });
        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String colour = etElement.getText().toString();
                int pos = Integer.parseInt(etIndexElement.getText().toString());
                alColours.set(pos, colour);
                aaColour.notifyDataSetChanged();
            }
        });
    }
}
