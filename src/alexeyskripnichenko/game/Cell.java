package alexeyskripnichenko.game;

import alexeyskripnichenko.Organizm;
import alexeyskripnichenko.herbivore.Rabbit;
import alexeyskripnichenko.plants.Plants;
import alexeyskripnichenko.predators.Wolf;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.ThreadLocalRandom;

public class Cell {
    Set<Organizm> organismsInCells = new HashSet<>();

    private int coordinateX;
    private int coordinateY;
    private int numberOfWolf;
    private int numberOfRabbit;

    private int numberOfPlants;

    public Cell() {

        this.coordinateX = getCoordCellX();
        this.coordinateY = getCoordinateY();

        Wolf wolf = new Wolf(this);
        Rabbit rabbit = new Rabbit(this);
        Plants plant = new Plants(this);

        numberOfWolf = ThreadLocalRandom.current().nextInt(0, wolf.getMaxValue());
        numberOfRabbit = ThreadLocalRandom.current().nextInt(0, rabbit.getMaxValue());
        numberOfPlants = ThreadLocalRandom.current().nextInt(0, plant.getMaxValue());

        for (int i = 0; i < numberOfWolf; i++) {
            organismsInCells.add(new Wolf(this));
        }
        for (int i = 0; i < numberOfRabbit; i++) {
            organismsInCells.add(new Rabbit(this));
        }
        for (int i = 0; i < numberOfPlants; i++) {
            Plants e = new Plants(this);
            organismsInCells.add(e);
        }

    }


    public Set<Organizm> getOrganismsInCells() {
        return organismsInCells;
    }

    public void setOrganismsInCells(Set<Organizm> organismsInCells) {
        this.organismsInCells = organismsInCells;
    }


    public int getNumberOfWolf() {
        return numberOfWolf;
    }

    public void setNumberOfWolf(int numberOfWolf) {
        this.numberOfWolf = numberOfWolf;
    }

    public int getNumberOfRabbit() {
        return numberOfRabbit;
    }

    public void setNumberOfRabbit(int numberOfRabbit) {
        this.numberOfRabbit = numberOfRabbit;
    }

    public int getNumberOfPlants() {
        return numberOfPlants;
    }

    public void setNumberOfPlants(int numberOfPlants) {
        this.numberOfPlants = numberOfPlants;
    }

    public int getCoordCellX() {
        return coordinateX;
    }

    public void setCoordCellX(int coordCellX) {
        this.coordinateX = coordCellX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(int coordinateY) {
        this.coordinateY = coordinateY;
    }

    @Override
    public String toString() {
        return "Ячейка: " + coordinateX
                + "/" + coordinateY
                + " содержит - "
                + organismsInCells + " "
                + numberOfWolf + " " + numberOfRabbit + " " + numberOfPlants;

    }
}

