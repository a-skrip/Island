package alexeyskripnichenko.plants;

import alexeyskripnichenko.Organizm;
import alexeyskripnichenko.game.Cell;

public class Plants extends Organizm {


    public Plants(Cell cell) {
       super("Травушка", "\uD83C\uDF40", 1,200 );
    }

    @Override
    public void multiply() {
    }

}
