package sudoku.problemdomain;

import java.util.Objects;

public class Coordinates {
    private final int x;
    private final int y;

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) {return true; }
        if (o == null || getClass() != o.getClass()) { return false;}

        Coordinates coordinates = (Coordinates) o;
        if (x != coordinates.x && y != coordinates.y) { return false;}
        else { return true;}
    }


    @Override
    public int hashCode() {
        return Objects.hash(x,y);
    }
}
