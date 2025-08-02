package org.sda.factory;

import java.util.Arrays;

public class GameFactory {


    public static Game getGame(String type) {

        // type is a valid GameType
        if (type == GameType.FOOTBALL.name()) { // "FOOTBALL"
            return new Football();
        } else if (type == GameType.CHESS.name()) { // "CHESS"
            return new Chess();
        } else {
            throw new IllegalArgumentException("Unknown game");
        }
    }

    public static void main(String[] args) {
        Game game1 = GameFactory.getGame("FOOTBALL");
        game1.play();

        Game game2 = GameFactory.getGame("CHESS");
        game2.play();
    }
}
