package sg.edu.rp.c346.colorlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static sg.edu.rp.c346.colorlist.R.id.imageViewColor;

/**
 * Created by 16046544 on 24/7/2017.
 */

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    //Modify your data class name
    ArrayList<Color> colorlist;

    public CustomAdapter(Context context, int resource, ArrayList<Color> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        colorlist = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Standard code don't need to modify
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);

        //obtain the UI lements and assign to variables (code this segment)
        TextView tvColor = (TextView) rowView.findViewById(R.id.textViewColor);
        ImageView imgColor = (ImageView) rowView.findViewById(imageViewColor);
        Color currentItem = colorlist.get(position);

        //set the textview to display corresponding information
        tvColor.setText(currentItem.getColor());

        if(currentItem.getColor().equals("blue")){
            imgColor.setImageResource(R.drawable.blue_box);
        }
        else if(currentItem.getColor().equals("orange")){
            imgColor.setImageResource(R.drawable.orange_box);
        }
        else{
            imgColor.setImageResource(R.drawable.brown_box);
        }

        //return the View corresponding to the data at the specified position.


        return rowView;

    }
}