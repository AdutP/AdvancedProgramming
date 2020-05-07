package ro.info.uaic;

public class Game {
    private int roomId;

    private Player owner;
    private Player guest;

    private Board board;
    private boolean alreadyStarted;

    private static int ids = 0;

    private int ownerId;

    public Game(Player owner) {
        roomId = ids++;
        alreadyStarted = false;

        board = new Board();

        this.owner = owner;
    }

    public Board getBoard() {
        return board;
    }

    public int playerCount() {
        if (guest == null) return 1; else return 2;
    }

    public String start(Player owner) {
        if (playerCount() == 1) return "Waiting for opponent to join..";
        alreadyStarted = true;
        board.newBoard();
        return "Start game";
    }

}
