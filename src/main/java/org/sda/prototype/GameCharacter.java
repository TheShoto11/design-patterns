package org.sda.prototype;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class GameCharacter implements Cloneable {
    private String name;
    private int level;
    private List<GameItem> items;

    public GameCharacter clone() {
        return new GameCharacter(this.name, this.level, new ArrayList<>(this.items));

        // shallow:
        /*

        try {
            return (GameCharacter) super.clone(); // shallow copy
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
         */
    }

    public GameCharacter(String name, int level, List<GameItem> items) {
        this.name = name;
        this.level = level;
        this.items = new ArrayList<>(items);
    }

    public void display() {
        System.out.println("Character: " + name + ", Level: " + level + ", Items: " + items.toString());
    }

    public static void main(String[] args) {
        List<GameItem> itemList = new ArrayList<>();
        itemList.add(new GameItem("Potion", 5));
        itemList.add(new GameItem("Sword", 7));
        GameCharacter original = new GameCharacter("Warrior", 10, itemList);
        GameCharacter clone = original.clone();
        System.out.println("After cloning");
        original.display(); // Warrior, 10
        clone.display();    // Warrior, 10


        clone.name = "Archer"; // customize clone
        clone.items.getFirst().setLevel(20);
        System.out.println("After updating clone name");
        original.display(); // Warrior, 10
        clone.display();    // Warrior, 10

        original.name = "Mage";
        clone.items.getLast().setLevel(1);
        System.out.println("After updating original name");
        original.display(); // Warrior, 10
        clone.display();    // Warrior, 10


    }

}
