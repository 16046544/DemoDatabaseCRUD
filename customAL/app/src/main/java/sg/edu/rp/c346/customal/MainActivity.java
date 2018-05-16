package sg.edu.rp.c346.customal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ListView lvToDo;
    ArrayList<ToDoItem> toDoList;
    CustomAdapter caToDo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvToDo = (ListView) findViewById(R.id.listViewToDo);
        toDoList = new ArrayList<ToDoItem>();

        caToDo = new CustomAdapter(this,R.layout.todoitem_row,toDoList);
        lvToDo.setAdapter(caToDo);

        Calendar d1 = Calendar.getInstance(); //create calendar with object
        d1.set(2016,10,1); // set new date
        ToDoItem item1 = new ToDoItem("MSA",d1); //create a ToDOItem object
        toDoList.add(item1); //add the ToDoItem object to the toDoList ArrayList

        Calendar d2 = Calendar.getInstance(); //create calendar with object
        d2.set(2016,9,20); // set new date
        ToDoItem item2 = new ToDoItem("Go for haircut",d2);
        toDoList.add(item2); //add the ToDoItem object to the toDoList ArrayList
    }
}
