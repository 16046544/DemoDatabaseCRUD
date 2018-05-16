package sg.edu.rp.c346.customal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
/**
 * Created by 16046544 on 17/7/2017.
 */

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;

    //Modify your data class name
    ArrayList<ToDoItem> toDoList;

    public CustomAdapter(Context context, int resource, ArrayList<ToDoItem> objects) {
        super(context, resource, objects);

        parent_context = context;
        layout_id = resource;
        toDoList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Standard code don't need to modify
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);

        //obtain the UI lements and assign to variables (code this segment)
        TextView tvTitle = (TextView) rowView.findViewById(R.id.textViewTitle);
        TextView tvDate = (TextView) rowView.findViewById(R.id.textViewDate);
        ToDoItem currentItem = toDoList.get(position);

        //set the textview to display corresponding information
        tvTitle.setText(currentItem.getTitle());
        tvDate.setText(currentItem.getDateString());

        return rowView;

    }
}