package edu.uoc.uocoban.model.entities.movable;

import edu.uoc.uocoban.model.Level;
import edu.uoc.uocoban.model.utils.Position;

import static edu.uoc.uocoban.model.utils.Sprite.BIG_BOX;

public class BigBox extends Box{
    public BigBox(Position position, Level level){
        super(position,BIG_BOX, level);
    }
}
