package com.company.engine;

import com.company.consoleVisualisation.Visualisator;
import com.company.factory.RandomCharacterFactory;
import com.company.factory.RandomVector2dFactory;
import com.company.map.WorldMap;

public class WorldEngine {
    WorldMap worldMap;

    public WorldEngine(int size){
        worldMap = new WorldMap(size);
        worldMap.putCharactersOnMap(10);

        int daysNumber = 10;
        for(int i=0; i<daysNumber; i++){
            worldMap.day();
            Visualisator.printWorld(worldMap);
        }

    }
}

