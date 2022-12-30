package at.rangel.projects.oo.musicbox;

public class Title {
    private int length;
    private String name;

    public Title(String name, int length) {
        this.name = name;
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public String getName() {
        return name;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setName(String name) {
        this.name = name;
    }
}
