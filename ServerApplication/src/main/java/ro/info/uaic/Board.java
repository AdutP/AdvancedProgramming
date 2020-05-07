package ro.info.uaic;

import java.util.Arrays;
import java.util.List;

public class Board {
    int[][] boardSpaces = new int[15][15];

    public Board() {
        Arrays.fill(boardSpaces, 0);
    }

    public void newBoard() {
        Arrays.fill(boardSpaces, 0);
    }

    }
