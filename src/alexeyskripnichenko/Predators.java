package alexeyskripnichenko;

import alexeyskripnichenko.Animal;
import alexeyskripnichenko.game.Cell;

public class Predators extends Animal {


    public Predators(String name, String icon, double startWeigth, double maxWeigth, double minWeigth, int maxValue, int speed, double maxFood) {
        super(name, icon, startWeigth, maxWeigth, minWeigth, maxValue, speed, maxFood);
    }


    @Override
    public void multiply() {

    }
}
