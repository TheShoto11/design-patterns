package org.sda.prototype;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GameItem implements Cloneable{
    private String name;
    private int level;

    public GameItem clone(){
        try {
            return (GameItem) super.clone();
        } catch (CloneNotSupportedException cse){
            throw new AssertionError();
        }
    }
}
