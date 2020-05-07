package ro.info.uaic;

public class Player {
    private static int ids = 0;
    private int playerId;

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public Player() {
        playerId = ids++;
    }

    @Override
    public String toString() {
        return "Player{" + playerId + '}';
    }
}
