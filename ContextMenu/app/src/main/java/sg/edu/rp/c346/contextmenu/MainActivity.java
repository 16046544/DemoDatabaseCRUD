package sg.edu.rp.c346.contextmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //step 1
    TextView textViewText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //step 2
        textViewText = (TextView)findViewById(R.id.textViewtranslatedText);

        //step 3
        registerForContextMenu(textViewText);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        menu.add(0,0,0,"English");
        menu.add(0,1,1,"Italian");
        menu.add(0,2,2,"German");

    }

    @Override

    public boolean onContextItemSelected(MenuItem item) {
        if(item.getItemId()==0) { //check whether the selected menu item ID is 0
            //code for action
            Toast.makeText(MainActivity.this, "English is chosen", Toast.LENGTH_SHORT).show();
            textViewText.setText("Hello");
            return true;  //menu item successfully handled
        }
        else if(item.getItemId()==1) { //check whether the selected menu item ID is 0
            //code for action
            Toast.makeText(MainActivity.this, "Italian is chosen", Toast.LENGTH_SHORT).show();
            textViewText.setText("Ciao");
            return true;  //menu item successfully handled
        }
        else{
            //code for action
            Toast.makeText(MainActivity.this, "German is chosen", Toast.LENGTH_SHORT).show();
            textViewText.setText("Hallo");
        }

        return super.onContextItemSelected(item); //pass menu item to the superclass implementation.
    }

}