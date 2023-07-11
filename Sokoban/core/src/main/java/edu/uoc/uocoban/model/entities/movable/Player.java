package edu.uoc.uocoban.model.entities.movable;

import edu.uoc.uocoban.model.Level;
import edu.uoc.uocoban.model.entities.MapItem;
import edu.uoc.uocoban.model.entities.pathable.Path;
import edu.uoc.uocoban.model.utils.Direction;
import edu.uoc.uocoban.model.utils.Position;
import edu.uoc.uocoban.model.utils.Sprite;

import static edu.uoc.uocoban.model.utils.Sprite.*;

public class Player extends MovableEntity{
    public Player(Position position, Level level){
        super(position, PLAYER, level);
    }
    public boolean isPathable(){
        return false;
    }
    public boolean move(Direction direction){
        // TODO

        Position origPosition = new Position(getPosition().getX(), getPosition().getY());
        Position newPosition = new Position(getPosition().getX()+direction.getX(), getPosition().getY()+direction.getY());
        Level lev = getLevel();
        Sprite item = lev.getMapItem(newPosition).getSprite();
        MapItem plPosition = lev.getMapItem(getPosition());
        MapItem itemPos = lev.getMapItem(newPosition);
        Path newItemPath = new Path(getPosition());

        if(item == Sprite.PATH) {
            lev.removeMapItem(plPosition);
            MapItem itemMap2Moved = itemPos;
            itemMap2Moved.setPosition(origPosition);
            lev.addMapItem(itemMap2Moved);
            lev.removeMapItem(itemPos);
            MapItem itemMapMoved = plPosition;
            itemMapMoved.setPosition(newPosition);
            lev.addMapItem(itemMapMoved);
            this.setPosition(newPosition);
            return true;

        } else if (item == Sprite.BIG_BOX) {
            BigBox caja = ((BigBox) getLevel().getMapItem(newPosition));
            if (caja.move(direction)){
                getLevel().removeMapItem(getLevel().getMapItem(newPosition));
                setPosition(null);
                lev.removeMapItem(plPosition);
                lev.addMapItem(newItemPath);
                setPosition(newPosition);
                lev.addMapItem(this);
                return true;

            } else return false;

        } else if (item == Sprite.SMALL_BOX) {
            SmallBox caja = ((SmallBox) getLevel().getMapItem(newPosition));
            if (caja.move(direction)){
                lev.removeMapItem(getLevel().getMapItem(newPosition));
                lev.removeMapItem(this);
                setPosition(null);
                lev.addMapItem(newItemPath);
                this.setPosition(newPosition);
                lev.addMapItem(this);
                return true;

            } else return false;

        }
        return false;
    }
}
