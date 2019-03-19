package com.netcracker.courses.oop.Coffee;

/**
 * Created by HP on 19.03.2019.
 */
public class Coffee {

        public void setKind (int a){
        switch (a) {
            case 1:
                kind = "arabica";
                break;
            case 2:
                kind = "robusta";
                break;
        }
    }

    public String getKind() {
        return kind;
    }

    private String kind;

    public void setState(int a) {
        switch (a) {
            case 1:
                state = "grains";
                break;
            case 2:
                state = "milled";
                break;
            case 3:
                state = "instant coffee";
                break;
        }
    }

    public String getState() {
        return state;
    }

    private String state;

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    private int weight;

}