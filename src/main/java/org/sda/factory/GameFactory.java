package org.sda.factory;

public class GameFactory {
    public static Game getGame(String type) {
        if (type == GameType.FOOTBALL.name()){
            return new Football();
        } else if (type == GameType.CHESS.name()){
            return new Chess();
        } else {
            throw new IllegalArgumentException("Unknown game");
        }
    }

    public static void main(String[] args) {
        Game game1 = GameFactory.getGame(GameType.FOOTBALL.name());
        game1.play();

        Game game2 = GameFactory.getGame(GameType.CHESS.name());
        game2.play();
    }
}
