package sg.edu.rp.c346.p05_quiz2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editTextN1;
    EditText editTextN2;
    TextView textViewOperation;
    TextView textViewDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextN1 = (EditText) findViewById(R.id.editTextN1);
        editTextN2 = (EditText) findViewById(R.id.editTextN2);
        textViewOperation = (TextView) findViewById(R.id.textViewOperation);
        textViewDisplay = (TextView) findViewById(R.id.textViewDisplay);

        registerForContextMenu(textViewOperation);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        menu.add(0,0,0,"+");
        menu.add(0,1,1,"-");

    }

    @Override

    public boolean onContextItemSelected(MenuItem item) {
        int num1 = Integer.parseInt(editTextN1.getText().toString());
        int num2 = Integer.parseInt(editTextN2.getText().toString());
        if(item.getItemId()==0) { //check whether the selected menu item ID is 0
            //code for action
             int ans = num1 + num2;
                textViewDisplay.setText(String.valueOf(ans));
            return true;  //menu item successfully handled
        }
        else if(item.getItemId()==1) { //check whether the selected menu item ID is 0
            //code for action
            int ans = num1 - num2;
                textViewDisplay.setText(String.valueOf(ans));
            return true;  //menu item successfully handled
        }
        else{
            //code for action
            textViewDisplay.setText("");
        }

        return super.onContextItemSelected(item); //pass menu item to the superclass implementation.
    }

}
