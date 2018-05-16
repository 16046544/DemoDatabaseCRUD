package sg.edu.rp.c346.moviels;

import android.widget.ImageView;

import java.util.Calendar;

/**
 * Created by 16046544 on 24/7/2017.
 */

public class Movies {
    String title;
    String year;
    String rated;
    String genre;
    Calendar date;
    String theatre;
    String location;

    public Movies(String title, String year, String rated, String genre, String watched, Calendar date, String theatre, String location, ImageView advisory) {
        this.title = title;
        this.year = year;
        this.rated = rated;
        this.genre = genre;
        this.date = date;
        this.theatre = theatre;
        this.location = location;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getRated() {
        return rated;
    }

    public void setRated(String rated) {
        this.rated = rated;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public String getTheatre() {
        return theatre;
    }

    public void setTheatre(String theatre) {
        this.theatre = theatre;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
