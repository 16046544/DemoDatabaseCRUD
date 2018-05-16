package sg.edu.rp.c346.colorlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvColor;
    ArrayList<Color> colorList;
    CustomAdapter caColorList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvColor = (ListView)findViewById(R.id.listViewColor);
        colorList = new ArrayList<Color>();

        caColorList = new CustomAdapter(this,R.layout.color_row,colorList);
        lvColor.setAdapter(caColorList);

        Color item1 = new Color("blue");
        colorList.add(item1);

        Color item2 = new Color("orange");
        colorList.add(item2);

        Color item3 = new Color("brown");
        colorList.add(item3);

        Color item4 = new Color("blue");
        colorList.add(item4);

    }
}
