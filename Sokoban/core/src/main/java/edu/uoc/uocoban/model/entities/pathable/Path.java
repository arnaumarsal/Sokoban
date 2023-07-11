package edu.uoc.uocoban.model.entities.pathable;

import edu.uoc.uocoban.model.entities.MapItem;
import edu.uoc.uocoban.model.utils.Position;

import static edu.uoc.uocoban.model.utils.Sprite.PATH;

public class Path extends MapItem {
    public Path(Position position){
        super(position, PATH);
    }
    public boolean isPathable(){
        return true;
    }
}
