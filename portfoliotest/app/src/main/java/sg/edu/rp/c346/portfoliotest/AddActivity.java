package sg.edu.rp.c346.portfoliotest;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class AddActivity extends AppCompatActivity {

    EditText editTextTitle;
    Button buttonAddImg;
    ImageButton imageButtons1;
    ImageButton imageButtons2;
    ImageButton imageButtons3;
    ImageButton imageButtons4;
    ImageButton imageButtons5;
    EditText editTextStory;
    Button buttonCancel;
    Button buttonSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        editTextTitle = (EditText)findViewById(R.id.editTextTitle);
        buttonAddImg = (Button)findViewById(R.id.buttonAddImg);
        imageButtons1 = (ImageButton)findViewById(R.id.imageButtons1);
        imageButtons2 = (ImageButton)findViewById(R.id.imageButtons2);
        imageButtons3 = (ImageButton)findViewById(R.id.imageButtons3);
        imageButtons4 = (ImageButton)findViewById(R.id.imageButtons4);
        imageButtons5 = (ImageButton)findViewById(R.id.imageButtons5);
        editTextStory = (EditText)findViewById(R.id.editTextStory);
        buttonCancel = (Button)findViewById(R.id.buttonCancel);
        buttonSubmit = (Button)findViewById(R.id.buttonSubmit);



        buttonCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String title = editTextTitle.getText().toString();
                String story = editTextStory.getText().toString();

                if(title.matches("") || story.matches("")){
                    Toast.makeText(getApplicationContext(), "You forgot a blank!", Toast.LENGTH_SHORT).show();
                }

                else{
                    Intent intentToPage = new Intent(getBaseContext(), SubmitActivity.class);
                    Intent intentToList = new Intent(getBaseContext(), BrowseActivity.class);
                    intentToPage.putExtra("Title", editTextTitle.getText().toString());
                    intentToList.putExtra("Title", editTextTitle.getText().toString());
                    intentToPage.putExtra("Story", editTextStory.getText().toString());
                    intentToList.putExtra("Story", editTextStory.getText().toString());
                    startActivity(intentToList);
                    Toast.makeText(getApplicationContext(), "Log successfully added!", Toast.LENGTH_SHORT).show();
                    {
                        finish();
                    }
                }
            }
        });

    }

}
