package sg.edu.rp.c346.dialogexample;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Simple dialog
    Button btnSimpleDialog;
    //Button Dalog
    Button btnButtonsDialog;
    TextView tvButtonsDialog;
    //Custom Dialog
    Button btnCustomDialog;
    TextView tvCustomDialog;
    EditText etCustomDialog;
    //Number dialog
    Button btnNumdialog;
    EditText etNum1Dialog;
    EditText etNum2Dialog;
    TextView tvNumDialog;

    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            //Step 2 Simple dialog bind button
            btnSimpleDialog = (Button)findViewById(R.id.buttonSimpleDialog);
            btnSimpleDialog.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    //create dialog builder
                    AlertDialog.Builder myBuilder = new AlertDialog.Builder(MainActivity.this);

                    myBuilder.setPositiveButton("Close", null);
                    myBuilder.setTitle("Simple Dialog demo");
                    myBuilder.setMessage("This is a simple Dialog");
                    myBuilder.setCancelable(false);

                    AlertDialog myDialog = myBuilder.create();

                    myDialog.show();
                }
            });
        //Step 2 Button dialog bind button
        tvButtonsDialog = (TextView)findViewById(R.id.textViewButtonsDialog) ;
        btnButtonsDialog = (Button)findViewById(R.id.buttonButtonsDialog);
        btnButtonsDialog.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //create dialog builder
                AlertDialog.Builder myBuilder = new AlertDialog.Builder(MainActivity.this);

                myBuilder.setTitle("Buttons Dialog demo");
                myBuilder.setMessage("This is a Button Dialog");
                myBuilder.setCancelable(false);

                //configure positive button
                myBuilder.setPositiveButton("Positive", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        tvButtonsDialog.setText("You have selected Positive");
                    }
                });

                //configure negative button
                myBuilder.setNegativeButton("Negative", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        tvButtonsDialog.setText("You have selected Negative");
                    }
                });

                //Configure neutral buttons
                myBuilder.setNeutralButton("Cancel",null);
                AlertDialog myDialog = myBuilder.create();
                myDialog.show();
            }
        });
        /*
        //Step 2 Custom dialog bind button
        tvCustomDialog = (TextView)findViewById(R.id.textViewCustomDialog);
        btnCustomDialog = (Button)findViewById(R.id.buttonCustomDialog);
        btnCustomDialog.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){


                //inflate the input.xml layout file
                LayoutInflater inflater= (LayoutInflater)getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

                View viewDialog = inflater.inflate(R.layout.input, null);

                //obtain the UI component
                final EditText etCustomDialog = (EditText)viewDialog.findViewById(R.id.editTextInput);

                //create dialog builder
                AlertDialog.Builder myBuilder = new AlertDialog.Builder(MainActivity.this);

                //set dialog views
                myBuilder.setView(viewDialog);
                myBuilder.setTitle("Text Input Dialog demo");

                //configure positive button
                myBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        //extract the message from edit text input to string
                        String message = etCustomDialog.getText().toString();
                        //update the text view to the input variable
                        tvCustomDialog.setText(message);
                    }
                });
                */

                //FOR SECOND CUSTOM INPUT
        //Step 2 Custom dialog bind button
        tvNumDialog = (TextView)findViewById(R.id.textViewNumDialog);
        etNum1Dialog = (EditText)findViewById(R.id.editTextNum1);
        etNum2Dialog = (EditText)findViewById(R.id.editTextNum2);
        btnNumdialog = (Button)findViewById(R.id.buttonNumdialog);
        btnNumdialog.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //inflate the input.xml layout file
                LayoutInflater inflater= (LayoutInflater)getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View viewDialog = inflater.inflate(R.layout.input2, null);

                //obtain the UI component
                final EditText etNumDialog = (EditText)viewDialog.findViewById(R.id.editTextInput);

                //create dialog builder
                AlertDialog.Builder myBuilder = new AlertDialog.Builder(MainActivity.this);

                //set dialog views
                myBuilder.setView(viewDialog);
                myBuilder.setTitle("Text Input Dialog demo");

                //configure positive button
                myBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        //extract the message from edit text input to string
                        int num1 = Integer.parseInt(String.valueOf(etNum1Dialog));
                        int num2 = Integer.parseInt(String.valueOf(etNum2Dialog));
                        int total = num1+num2;
                        String message = String.valueOf(total);
                        //update the text view to the input variable
                        tvNumDialog.setText(message);
                    }
                });
                //configure negative button
                myBuilder.setNegativeButton("Cancel", null);

                AlertDialog myDialog = myBuilder.create();
                myDialog.show();
            }
        });
    }
}
