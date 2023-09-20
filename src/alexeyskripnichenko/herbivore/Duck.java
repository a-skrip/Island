package alexeyskripnichenko.herbivore;

import alexeyskripnichenko.Herbivors;
import alexeyskripnichenko.game.Cell;

public class Duck extends Herbivors {

    private static final String icon = "";

    public Duck(String name, String icon, double startWeigth, double maxWeigth, double minWeigth, int maxValue, int speed, double maxFood ) {
        super(name, icon, startWeigth, maxWeigth, minWeigth, maxValue, speed, maxFood );
    }
}
