package alexeyskripnichenko;

import alexeyskripnichenko.game.Cell;

public abstract class Animal extends Organizm {


    private double maxWeigth;
    private double minWeigth;
    private final int minSpeed = 0;
    private int speed;
    private double maxFood;

    public Animal(String name, String icon, double startWeigth, double maxWeigth, double minWeigth, int maxValue, int speed, double maxFood) {
        super(name, icon, startWeigth, maxValue);
        this.maxWeigth = maxWeigth;
        this.minWeigth = minWeigth;
        this.speed = speed;
        this.maxFood = maxFood;
    }


//         если в ячейке есть особь того же вида, то размножаемся  -  создаем новую


    public void eat(Organizm organizm) {
        this.setWeigth(this.getWeigth() + organizm.getWeigth());
        organizm.die();
    }

    // Рандомим ход на X ячеек
    // Проверяем куда можно идти
    // если упираемся, то продолжить мможно влево, вправо, вверх или вниз (или просто отзеркалить)
    // проверка на  MAX количесто особей в ячейке
    // добавляю животное в новую Cell, а из старой удаляю
    // умножаю вес на коэффициент потери веса  - 3%
    public void move(Cell cell) {


    }

    public double getMaxWeigth() {
        return maxWeigth;
    }

    public void setMaxWeigth(double maxWeigth) {
        this.maxWeigth = maxWeigth;
    }

    public double getMinWeigth() {
        return minWeigth;
    }

    public void setMinWeigth(double minWeigth) {
        this.minWeigth = minWeigth;
    }

    public int getMinSpeed() {
        return minSpeed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getMaxFood() {
        return maxFood;
    }

    public void setMaxFood(double maxFood) {
        this.maxFood = maxFood;
    }


}
