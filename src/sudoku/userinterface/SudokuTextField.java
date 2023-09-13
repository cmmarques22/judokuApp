package sudoku.userinterface;

import javafx.scene.control.TextField;


// maintain x and y coordinate
//

public class SudokuTextField extends TextField
{
    private final int x;
    private final int y;

    public SudokuTextField(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


    //avoid repeated numbers, Replaces a range of characters with the given text.
    //start - The starting index in the range, inclusive. This must be >= 0 and < the end.
    //end - The ending index in the range, exclusive. This is one-past the last character to delete (consistent with the String manipulation methods). This must be > the start, and <= the length of the text.
    //text - The text that is to replace the range. This must not be null.
    @Override
    public void replaceText(int start, int end, String text) {
        if (text.matches("[0-9]")) {
        }
        //call the overridden method
            super.replaceText(start, end, text);
        }

    // Replaces the selection with the given replacement String.
    // If there is no selection, then the replacement text is simply inserted
    // at the current caret position.
    @Override
    public void replaceSelection(String text) {
        if (text.matches("[0-9]")) {
            super.replaceSelection(text);
        }
}}
