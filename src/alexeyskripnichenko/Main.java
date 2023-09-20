package alexeyskripnichenko;

import alexeyskripnichenko.game.Cell;
import alexeyskripnichenko.game.GamePreference;
import alexeyskripnichenko.herbivore.Buffalo;
import alexeyskripnichenko.herbivore.Rabbit;
import alexeyskripnichenko.plants.Plants;
import alexeyskripnichenko.predators.Wolf;

import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        GamePreference gamePreference = new GamePreference();

        for (Cell[] cell : gamePreference.getGameFields()) {
            for (Cell cell1 : cell) {
                System.out.println(cell1);

            }
        }



    }
}
