package edu.uoc.uocoban.model.entities;

import edu.uoc.uocoban.model.utils.Position;

import static edu.uoc.uocoban.model.utils.Sprite.WALL;

public class Wall extends MapItem{

    public Wall(Position position){
        super(position, WALL);
    }
    public boolean isPathable(){
        return false;
    }
}
