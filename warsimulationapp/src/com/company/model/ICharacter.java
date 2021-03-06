package com.company.model;

import com.company.util.Vector2d;
import com.company.util.WorldDirections;

import java.util.List;
import java.util.Map;
import java.util.Random;

public interface ICharacter {
    public int attack(int opponentArmor);

    default void move(Map<Vector2d, List<ICharacter>> map, Vector2d vector2d){

        map.get(vector2d).remove(this);

        switch (WorldDirections.getRandomDirection()){
            case NORTH:
                map.get(vector2d.getNewVector2d(WorldDirections.NORTH)).add(this);
            case SOUTH:
                map.get(vector2d.getNewVector2d(WorldDirections.SOUTH)).add(this);
            case WEST:
                map.get(vector2d.getNewVector2d(WorldDirections.WEST)).add(this);
            case EAST:
                map.get(vector2d.getNewVector2d(WorldDirections.EAST)).add(this);
        }
    }
    public int getHP();
    public void setHP(int hp);
    public int getArmor();
}
