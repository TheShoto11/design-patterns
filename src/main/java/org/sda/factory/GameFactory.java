package org.sda.factory;

import java.util.Arrays;

public class GameFactory {
    public static Game getGame(String type) {

        if (type.isEmpty()) {
            throw new IllegalArgumentException("Unknown game");
        }

        if (Arrays.stream(GameType.values())
                .noneMatch(e -> e.name().equalsIgnoreCase(type))) {
            throw new IllegalArgumentException("Unknown game");
        }

        // type is a valid GameType
        if (type == GameType.FOOTBALL.name()) {
            return new Football();
        } else if (type == GameType.CHESS.name()) {
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
