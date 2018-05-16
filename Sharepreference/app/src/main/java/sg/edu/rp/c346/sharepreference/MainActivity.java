package sg.edu.rp.c346.sharepreference;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onPause() {
        super.onPause();

        //step 1b: obtain an instance of the shared preference
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);

        //step 1c: Obtain an instance of the shared preference editor for update later
        SharedPreferences.Editor prefEdit = prefs.edit();

        //Step 1d; Add the key vaulue pair
        prefEdit.putString("greeting","Hello!");

        //step ie: call commit() method to save the changes into the shared preference
        prefEdit.commit();

    }

    @Override
    protected void onResume() {
        super.onResume();

        //Step 2a: obtain an instance of the shared preference
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);

        //step 2b: Retrieve the saved data with the key, greeting from the sharedPreferences object.
        String strGreeting = prefs.getString("greeting","No greetings!");

        Toast toast = Toast.makeText(getApplicationContext(),strGreeting, Toast.LENGTH_LONG);
        toast.show();

    }

}
