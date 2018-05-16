package sg.edu.rp.c346.portfoliotest;

/**
 * Created by 16046544 on 4/12/2017.
 */

public class Entry {
    private String title;
    private String desc;
    private int rating;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Entry(String title, String desc, int rating) {
        this.title = title;
        this.desc = desc;
        this.rating = rating;
    }
}
