package alexeyskripnichenko.herbivore;

import alexeyskripnichenko.Herbivors;
import alexeyskripnichenko.game.Cell;

public class Mouse extends Herbivors {
    public Mouse(String name, String icon, double startWeigth, double maxWeigth, double minWeigth, int maxValue, int speed, double maxFood ) {
        super(name, icon, startWeigth, maxWeigth, minWeigth, maxValue, speed, maxFood );
    }
}
