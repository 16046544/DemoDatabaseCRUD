package sg.edu.rp.c346.dynamiclistviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> alColours = new ArrayList<String>();

    public void setAlColours(ArrayList<String> alColours) {
        this.alColours = alColours;
        alColours.add("Red");
        alColours.add(0, "Blue");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        alColours = new ArrayList<String>();
    }
}
