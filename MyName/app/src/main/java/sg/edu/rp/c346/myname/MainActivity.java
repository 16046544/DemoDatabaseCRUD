package sg.edu.rp.c346.myname;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button btnAdd;
    EditText etname;
    TextView tvdiplay;
    ListView namelist;

    ArrayList<String> nameArray = new ArrayList<>();
    ArrayAdapter<String> nameArAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnAdd = (Button)findViewById(R.id.btnAdd);
        etname = (EditText)findViewById(R.id.etname);
        tvdiplay = (TextView)findViewById(R.id.tvDisplay);
        namelist = (ListView)findViewById(R.id.nameList);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name= Element.getText().toString();
                alItem.add(colour);
                aalItem.notifyDataSetChanged();
            }
        });

    }
}
