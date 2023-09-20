package alexeyskripnichenko.predators;

import alexeyskripnichenko.Animal;
import alexeyskripnichenko.Organizm;
import alexeyskripnichenko.Predators;
import alexeyskripnichenko.game.Cell;

import java.util.HashSet;

public class Wolf extends Predators {

    public static final String name = "Волк";

    public Wolf(Cell cell) {
        super(name, "\uD83D\uDC3A", 50, 58, 35, 30, 3, 8);
    }

}
