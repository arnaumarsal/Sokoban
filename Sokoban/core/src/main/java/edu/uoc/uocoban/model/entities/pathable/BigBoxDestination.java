package edu.uoc.uocoban.model.entities.pathable;

import edu.uoc.uocoban.model.utils.Position;
import edu.uoc.uocoban.model.entities.movable.BigBox;

import static edu.uoc.uocoban.model.utils.Sprite.BIG_BOX_DESTINATION;
import static edu.uoc.uocoban.model.utils.Sprite.BIG_BOX_ON_DESTINATION;

public class BigBoxDestination extends Destination{

    public BigBoxDestination(Position position){
        super(position, BIG_BOX_DESTINATION);
    }
    public void mutate(){
        if (!isEmpty()) {
            setSprite(BIG_BOX_ON_DESTINATION);
        }
    }


}
