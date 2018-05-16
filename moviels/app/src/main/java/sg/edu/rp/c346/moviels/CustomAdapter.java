package sg.edu.rp.c346.moviels;

import android.content.Context;
import android.graphics.drawable.shapes.Shape;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 16046544 on 24/7/2017.
 */

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    //Modify your data class name
    ArrayList<Movies> movielist;

    public CustomAdapter(Context context, int resource, ArrayList<Movies> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        movielist = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Standard code don't need to modify
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);

        //obtain the UI lements and assign to variables (code this segment)
        TextView tvTitle = (TextView) rowView.findViewById(R.id.textViewTitle);
        ImageView imgRating = (ImageView) rowView.findViewById(R.id.imageViewRating);
        Movies currentItem = movielist.get(position);

        //set the textview to display corresponding information
        tvTitle.setText(currentItem.getTitle());


        if(currentItem.getTitle().equals("The Avengers")){
            imgRating.setImageResource(R.drawable.rating_pg13);
        }
        else if(currentItem.getTitle().equals("Planes")){
            imgRating.setImageResource(R.drawable.rating_pg);
        }
        else{
            imgRating.setImageResource(R.drawable.rating_g);
        }

        //return the View corresponding to the data at the specified position.
        return rowView;

    }
}

