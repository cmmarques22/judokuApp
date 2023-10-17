package sudoku.buildlogic;

import sudoku.computationlogic.GameLogic;
import sudoku.persistence.LocalStorageImpl;
import sudoku.problemdomain.IStorage;
import sudoku.problemdomain.SudokuGame;
import sudoku.userinterface.IUserInterfaceContract;
import sudoku.userinterface.logic.ControlLogic;

import java.io.IOException;

public class SudokuBuildLogic {

    //class takes in the uiImpl object which is tightly-coupled to the JavaFX framework,
    // binds that object to the various other objects necessary for the application to function


    public static void build(IUserInterfaceContract.View userInterface) throws IOException {
        SudokuGame initialState;
        IStorage storage = new LocalStorageImpl();


        try {
            // throw if no game data is found in local storage
            initialState = storage.getGameData();
        } catch (IOException e) {
            //throw an IOExceptionif we cannot update the game data.
            initialState = GameLogic.getNewGame();
            storage.updateGameData(initialState);

        }

        IUserInterfaceContract.EventListener uiLogic = new ControlLogic(storage, userInterface);
        userInterface.setListener(uiLogic);
        userInterface.updateBoard(initialState);


    }
}
