package sudoku.computationlogic;

import sudoku.problemdomain.Coordinates;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static sudoku.problemdomain.SudokuGame.GRID_BOUNDARY;

public class GameGenerator {
    public static int[][] getNewGameGrid() {
        return unsolveGame(getSolvedGame());
    }

    private static int[][] getSolvedGame() {
        Random random = new Random(System.currentTimeMillis());
        int[][] newGrid = new int[GRID_BOUNDARY][GRID_BOUNDARY];
        for (int value = 1; value <= GRID_BOUNDARY; value++) {
            int allocations = 0;
            int interrupt = 0;
            List<Coordinates> allocTracker = new ArrayList<>();

            int attempts = 0;
            while (allocations<GRID_BOUNDARY){
                if (interrupt.forEach(coord -> {
                    newGrid[coord.getX()][coord.getY()] = 0;
                }))
            }


        }

        return new int[0][];
    }


}
