package sg.edu.rp.c346.p06quiz;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static sg.edu.rp.c346.p06quiz.R.id.editTextw;

public class MainActivity extends AppCompatActivity {


    Button btnCU;
    Button btnSC;
    EditText eTw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCU = (Button)findViewById(R.id.buttonQ1);
        btnSC = (Button)findViewById(R.id.button2);
        eTw = (EditText)findViewById(editTextw);

        btnCU.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+"65103000"));
                startActivity(intent);
            }
        });

        btnSC.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String txt = eTw.getText().toString();

                Intent intent = new Intent(getBaseContext(),Main2Activity.class);
                intent.putExtra("comment is",txt);
                startActivity(intent);
            }
        });
    }
}
