package at.rangel.projects.oo.musicbox;

import java.util.ArrayList;
import java.util.List;

public class Record {
    private List<Title> titles;
    private String name;

    public Record(String name) {
        this.titles = new ArrayList<>();
        this.name = name;
    }

    public void addTitle(Title title) {
        this.titles.add(title);
    }

    public String getName() {
        return name;
    }

    public List<Title> getTitles() {
        return titles;
    }
}
