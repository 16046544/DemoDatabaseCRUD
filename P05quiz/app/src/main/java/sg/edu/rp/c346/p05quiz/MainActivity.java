package sg.edu.rp.c346.p05quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textViewFood;
    TextView textViewDisplay;
    Button buttonReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewFood = (TextView) findViewById(R.id.textViewFood);
        textViewDisplay = (TextView) findViewById(R.id.textViewDisplay);
        buttonReset = (Button) findViewById(R.id.buttonReset);

        registerForContextMenu(textViewFood);

        buttonReset.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textViewDisplay.setText("No food selected");
            }
        });
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        menu.add(0,0,0,"Rice");
        menu.add(0,1,1,"Noodle");

    }

    @Override

    public boolean onContextItemSelected(MenuItem item) {
        if(item.getItemId()==0) { //check whether the selected menu item ID is 0
            //code for action
            textViewDisplay.setText("Rice");
            return true;  //menu item successfully handled
        }
        else if(item.getItemId()==1) { //check whether the selected menu item ID is 0
            //code for action
            textViewDisplay.setText("Noodle");
            return true;  //menu item successfully handled
        }
        else{
            //code for action
            textViewDisplay.setText("No food selected");
        }

        return super.onContextItemSelected(item); //pass menu item to the superclass implementation.
    }
}
