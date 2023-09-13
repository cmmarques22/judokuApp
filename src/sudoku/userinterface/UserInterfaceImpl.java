package sudoku.userinterface;

import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import sudoku.problemdomain.Coordinates;
import sudoku.problemdomain.SudokuGame;

import java.util.HashMap;

public class UserInterfaceImpl implements IUserInterfaceContract.View {
    EventHandler<KeyEvent> {

        private final Stage stage;
        private final Group root;

        //how to track all text fields
        private HashMap<Coordinates, SudokuTextField> textFieldCoordinates;
        private IUserInterfaceContract.EventListener listener;

        private static final double WINDOW_Y = 732;
        private static final double WINDOW_x = 668;
        private static final double BOARD_PADDING = 50;
        private static final double BOARD_X_AND_Y = 576;





    }

    @Override
    public void setListener(IUserInterfaceContract.EventListener listener) {

    }

    @Override
    public void updateSquare(int x, int y, int input) {

    }

    @Override
    public void updateBoard(SudokuGame game) {

    }

    @Override
    public void showDialog(String message) {

    }

    @Override
    public void showError(String message) {

    }

    }
