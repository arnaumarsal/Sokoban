package edu.uoc.uocoban.model.entities.pathable;

import edu.uoc.uocoban.model.utils.Position;
import edu.uoc.uocoban.model.entities.movable.SmallBox;

import static edu.uoc.uocoban.model.utils.Sprite.*;

public class SmallBoxDestination extends Destination{
    public SmallBoxDestination(Position position){
        super(position, SMALL_BOX_DESTINATION);
    }
    public void mutate(){
        if (!isEmpty()) {
            this.setSprite(SMALL_BOX_ON_DESTINATION);
        }
    }

}
