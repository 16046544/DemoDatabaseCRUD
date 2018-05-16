package sg.edu.rp.c346.colorlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static sg.edu.rp.c346.colorlist.R.id.imageViewShape;

/**
 * Created by 16046544 on 24/7/2017.
 */

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    //Modify your data class name
    ArrayList<Shape> shapelist;

    public CustomAdapter(Context context, int resource, ArrayList<Shape> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        shapelist = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Standard code don't need to modify
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);

        //obtain the UI lements and assign to variables (code this segment)
        TextView tvShape = (TextView) rowView.findViewById(R.id.textViewShape);
        ImageView imgShape = (ImageView) rowView.findViewById(imageViewShape);
        Shape currentItem = shapelist.get(position);

        //set the textview to display corresponding information
        tvShape.setText(currentItem.getShape());

        if(currentItem.getShape().equals("square")){
            imgShape.setImageResource(R.drawable.square);
        }
        else if(currentItem.getShape().equals("rectangle")){
            imgShape.setImageResource(R.drawable.rectangle);
        }
        else{
            imgShape.setImageResource(R.drawable.brown_box);
        }

        //return the View corresponding to the data at the specified position.


        return rowView;

    }
}