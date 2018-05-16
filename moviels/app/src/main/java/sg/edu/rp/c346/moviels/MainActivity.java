package sg.edu.rp.c346.moviels;

import android.graphics.Movie;
import android.graphics.drawable.shapes.Shape;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvMovie;
    ArrayList<Movies> alMovies;
    CustomAdapter caMovieList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMovie = (ListView) findViewById(R.id.listViewMovie);
        alMovies = new ArrayList<Movies>();

        caMovieList = new CustomAdapter(this,R.layout.movies_row,alMovies);
        lvMovie.setAdapter(caMovieList);

        Movies item1 = new Movies("The Avengers","2016","PG13","Action",2016-02-01,"");
        alMovies.add(item1);

        Movies item2 = new Movies("Planes");
        alMovies.add(item2);
    }
}
