package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {
    private String[][] ticTacToeBoard;

    public TicTacToe(String[][] board) {
        ticTacToeBoard = new String[3][3];
    }

    public TicTacToe() {
        ticTacToeBoard = new String[3][3];
    }

    public String[] getRow(Integer value) {
        String[] result = new String[3];
        for (Integer i = 0; i < 3; i++) {
            result[i] = ticTacToeBoard[value][i];
        }

        return result;
    }

    public String[] getColumn(Integer value) {
        return null;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        return null;
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        return null;
    }

    public String getWinner() {
        return null;
    }

    public String[][] getBoard() {
        return null;
    }
}
