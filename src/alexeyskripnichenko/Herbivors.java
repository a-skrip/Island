package alexeyskripnichenko;

import alexeyskripnichenko.Animal;
import alexeyskripnichenko.game.Cell;
import alexeyskripnichenko.plants.Plants;

public class Herbivors extends Animal {

    public Herbivors(String name, String icon, double startWeigth, double maxWeigth, double minWeigth, int maxValue, int speed, double maxFood ) {
        super(name, icon, startWeigth, maxWeigth, minWeigth, maxValue, speed, maxFood );
    }


    @Override
    public void multiply() {

    }

    @Override
    public void die() {

    }
}

