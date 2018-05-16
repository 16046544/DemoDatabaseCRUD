package sg.edu.rp.c346.portfoliotest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;

    ArrayList<Entry> entryList;

    public CustomAdapter(Context context, int resource, ArrayList<Entry> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        entryList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id, parent, false);

        TextView tvTitle = (TextView)rowView.findViewById(R.id.textViewTitle);
        TextView tvDesc = (TextView)rowView.findViewById(R.id.textViewDesc);

        Entry currentItem = entryList.get(position);

        tvTitle.setText(currentItem.getTitle());
        tvDesc.setText(currentItem.getDesc());

        return rowView;
    }
}