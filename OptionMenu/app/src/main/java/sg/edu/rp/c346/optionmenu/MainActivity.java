package sg.edu.rp.c346.optionmenu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.id;

public class MainActivity extends AppCompatActivity {

    //step 1
    TextView textViewTea;
    TextView textViewCoffee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //step 2
        textViewTea = (TextView) findViewById(R.id.textViewTea);
        textViewCoffee = (TextView) findViewById(R.id.textViewCoffee);

        //step 3
        registerForContextMenu(textViewTea);
        registerForContextMenu(textViewCoffee);
    }

    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        if (R.id.EnglishSelection == 1) {
            menu.clear();
            menu.add(0,0,0,"Hot");
            menu.add(0,1,1,"Cold");
        }
        else{
            menu.clear();
            menu.add(0,0,0,"Caldo");
            menu.add(0,1,1,"Freddo");
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here.
        int id = item.getItemId();

        if (id == R.id.EnglishSelection) {
            Toast.makeText(MainActivity.this, "English is chosen", Toast.LENGTH_SHORT).show();
            textViewTea.setText("Tea");
            textViewCoffee.setText("Coffee");
            return true;
        }else if (id == R.id.italianSelection) {
            Toast.makeText(MainActivity.this, "Italian is chosen", Toast.LENGTH_SHORT).show();
            textViewTea.setText("tè");
            textViewCoffee.setText("caffè");
            return true;
        }else  {
            textViewTea.setText("Error translation");
        }

        return super.onOptionsItemSelected(item);
    }

}
