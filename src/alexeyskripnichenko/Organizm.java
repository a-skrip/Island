package alexeyskripnichenko;

import alexeyskripnichenko.game.Cell;

import java.util.HashSet;
import java.util.Set;

public abstract class Organizm {

    private String name;
    private String icon;
    private double weigth;
    private int maxValue;


    public Organizm(String name, String icon, double weigth, int maxValue) {
        this.name = name;
        this.icon = icon;
        this.weigth = weigth;
        this.maxValue = maxValue;

    }



    public abstract void multiply();

    public void die() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }



    @Override
    public String toString() {
        return icon;
    }


}
