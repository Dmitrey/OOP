package com.netcracker.courses.oop.Van;

/**
 * Created by HP on 19.03.2019.
 */
public class Van{

    public void setVanCapacity(int vanCapacity) {
        this.vanCapacity = vanCapacity;
        freeSpace = vanCapacity;
    }

    private int vanCapacity=100;

    public int getFreeSpace() {
        return freeSpace;
    }

    public void setFreeSpace(int freeSpace) {
        this.freeSpace = freeSpace;
    }

    private int freeSpace;
    public void loadVan(int a){
    }
}