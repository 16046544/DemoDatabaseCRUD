package sg.edu.rp.c346.portfoliotest;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class BrowseActivity extends AppCompatActivity {

    ListView listViewBrowse;
    ArrayList<Entry> entryList;
    CustomAdapter caEntry;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_browse);

        listViewBrowse = (ListView)findViewById(R.id.listViewBrowse);

        entryList = new ArrayList<Entry>();

        caEntry = new CustomAdapter(this, R.layout.item_row, entryList);

        listViewBrowse.setAdapter(caEntry);

        Entry item1 = new Entry("Title","Desc",4);

        entryList.add(item1);


    }

}
