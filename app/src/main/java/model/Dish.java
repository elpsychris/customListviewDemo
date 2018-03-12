package model;

/**
 * Created by elpsychris on 03/12/2018.
 */

public class Dish {
    private String name;
    private int quan;

    public Dish(String name, int quan) {
        this.name = name;
        this.quan = quan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuan() {
        return quan;
    }

    public void setQuan(int quan) {
        this.quan = quan;
    }
}
