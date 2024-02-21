package alexeyskripnichenko.game;

import alexeyskripnichenko.Organizm;

public class GamePreference {

    private static Cell[][] gameFields = new Cell[8][4];


   public void moveToMap(Organizm organizm) {

   }
    public GamePreference() {

        for (int i = 0; i < gameFields.length; i++) {
            for (int j = 0; j < gameFields[i].length; j++) {
                Cell cell = new Cell();
                gameFields[i][j] = cell;
                int x = i;
                int y = j;
                cell.setCoordCellX(x);
                cell.setCoordinateY(y);

            }
        }
    }

    public Cell[][] getGameFields() {
        return gameFields;
    }

    public void setGameFields(Cell[][] gameFields) {
        this.gameFields = gameFields;
    }
}
