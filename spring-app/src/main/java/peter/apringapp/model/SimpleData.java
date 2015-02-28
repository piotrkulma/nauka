package main.java.peter.apringapp.model;

/**
 * Created by Piotr Kulma on 27.02.15.
 */
public class SimpleData {
    private int id;
    private String name;

    public SimpleData(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
