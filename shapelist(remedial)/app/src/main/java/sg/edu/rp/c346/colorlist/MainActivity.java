package sg.edu.rp.c346.colorlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvShape;
    ArrayList<Shape> shapeList;
    CustomAdapter caShapeList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvShape = (ListView)findViewById(R.id.listViewShape);
        shapeList = new ArrayList<Shape>();

        caShapeList = new CustomAdapter(this,R.layout.shape_row,shapeList);
        lvShape.setAdapter(caShapeList);

        Shape item1 = new Shape("square");
        shapeList.add(item1);

        Shape item2 = new Shape("rectangle");
        shapeList.add(item2);

    }
}
