package Cinema;

import javax.sound.midi.Soundbank;
import java.util.Objects;

public class Cinema {
    public static Place checkEmptyPlace(Place[][] places) {
        Place result = null;
        for (int row = 0; row < places.length; row++) {
            for (int cell = 0; cell < places[row].length; cell++) {
                if (places[row][cell] == null) {
                    if (cell == 0 && places[row][cell + 1] == null) {
                        result = checkEmptyVerticalPlace(places, row, cell);
                        if (result != null) {
                            return result;
                        }
                    } else if (cell != 0 && cell != places.length - 1 && places[row][cell + 1] == null && places[row][cell - 1] == null) {
                        result = checkEmptyVerticalPlace(places, row, cell);
                        if (result != null) {
                            return result;
                        }
                    } else if (cell == places.length - 1 && places[row][places.length - 2] == null) {
                        result = checkEmptyVerticalPlace(places, row, cell);
                        if (result != null) {
                            return result;
                        }
                    }
                }
            }
        }
        return null;
    }

    public static Place checkEmptyVerticalPlace(Place[][] places, int row, int cell) {
        if (row == 0 && places[row + 1][cell] == null) {
            return new Place(row, cell);
        } else if (row == places.length - 1 && places[row - 1][cell] == null) {
            return new Place(row, cell);
        } else if (row != 0 && row != places.length - 1 && places[row - 1][cell] == null && places[row + 1][cell] == null) {
            return new Place(row, cell);
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(checkEmptyPlace(new Place[][]{
                {new Place(0, 0), null, new Place(0, 2), null, new Place(0, 4)},
                {null, new Place(1, 1), null, new Place(1, 3), null},
                {new Place(2, 0), null, null, null, new Place(2, 4)},
                {null, new Place(3, 1), null, new Place(3, 3), null},
                {new Place(4, 0), new Place(4, 1), new Place(4, 2), null, null}}));
    }
}
