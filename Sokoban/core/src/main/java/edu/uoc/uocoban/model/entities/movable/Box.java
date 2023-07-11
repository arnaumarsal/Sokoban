package edu.uoc.uocoban.model.entities.movable;

import edu.uoc.uocoban.model.Level;
import edu.uoc.uocoban.model.entities.pathable.Destination;
import edu.uoc.uocoban.model.utils.Direction;
import edu.uoc.uocoban.model.utils.Position;
import edu.uoc.uocoban.model.utils.Sprite;

public abstract class Box extends MovableEntity{
    private boolean delivered = false;

    protected Box(Position position, Sprite sprite, Level level){
        super(position, sprite, level);
    }

    public boolean isDelivered() {
        return delivered;
    }
    private void setDelivered(boolean delivered){
        this.delivered = delivered;
    }
    public boolean isPathable(){
        return false;
    }
    public boolean move(Direction direction){
        // TODO

        Position newPosition = new Position(getPosition().getX()+direction.getX(), getPosition().getY()+direction.getY());
        Sprite item = getLevel().getMapItem(newPosition).getSprite();

        // Si la nueva posición es pathable, hacer lo siguiente y devolver true:
        if(item == Sprite.PATH){
            getLevel().removeMapItem(getLevel().getMapItem(newPosition));
            this.setPosition(newPosition);
            return true;

        } else if (item == Sprite.BIG_BOX_DESTINATION && this.getSprite() == Sprite.BIG_BOX){
            getLevel().removeMapItem(this);
            setDelivered(true);
            getLevel().getMapItem(newPosition).setPosition(newPosition);
            ((Destination) getLevel().getMapItem(newPosition)).setBox(this);
            ((Destination) getLevel().getMapItem(newPosition)).mutate();
            return true;

        } else if (item == Sprite.SMALL_BOX_DESTINATION && this.getSprite() == Sprite.SMALL_BOX){
            getLevel().removeMapItem(this);
            setDelivered(true);
            getLevel().getMapItem(newPosition).setPosition(newPosition);
            ((Destination) getLevel().getMapItem(newPosition)).setBox(this);
            ((Destination) getLevel().getMapItem(newPosition)).mutate();
            return true;

        } else { // Si no es pathable, no hacer nada y devolver false.
            return false;
        }

    }

}
