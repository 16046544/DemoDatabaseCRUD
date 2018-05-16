package sg.edu.rp.c346.employeeinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

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

        ToDoItem item1 = new ToDoItem("John", "Man", 8500);
        toDoList.add(item1);

        ToDoItem item2 = new ToDoItem("Mary", "wamen", 8500);
        toDoList.add(item2);
    }
}
