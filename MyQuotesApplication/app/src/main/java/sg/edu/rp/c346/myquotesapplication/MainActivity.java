package sg.edu.rp.c346.myquotesapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    int[] IMAGES = {R.drawable.abrahamlincoln, R.drawable.ghandi, R.drawable.stevejobs, R.drawable.muhammadali};

    String[] NAMES = {"Abraham Lincoln", "Ghandi", "Steve Jobs", "Muhammad Ali"};

    String[] DESCRIPTIONS = {"16th U.S President", "Freedom Fighter", "Successful Entrepreneur", "Professional boxer"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lv = (ListView) findViewById(R.id.lvNames);

        CustomAdapter customAdapter = new CustomAdapter();

        lv.setAdapter(customAdapter);

    }

    class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return IMAGES.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View view, ViewGroup parent) {
            view = getLayoutInflater().inflate(R.layout.row, null);

            ImageView iv = (ImageView) findViewById(R.id.ivPortrait);
            TextView tvName = (TextView) findViewById(R.id.tvName);
            TextView tvDesc = (TextView) findViewById(R.id.tvDescription);

            iv.setImageResource(IMAGES[position]);
            tvName.setText(NAMES[position]);
            tvDesc.setText(DESCRIPTIONS[position]);

            return view;
        }
    }

}
