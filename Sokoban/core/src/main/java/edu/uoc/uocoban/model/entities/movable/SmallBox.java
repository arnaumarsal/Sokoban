package edu.uoc.uocoban.model.entities.movable;

import edu.uoc.uocoban.model.Level;
import edu.uoc.uocoban.model.utils.Position;

import static edu.uoc.uocoban.model.utils.Sprite.SMALL_BOX;

public class SmallBox extends Box{
    public SmallBox(Position position, Level level){
        super(position, SMALL_BOX, level);
    }
}
