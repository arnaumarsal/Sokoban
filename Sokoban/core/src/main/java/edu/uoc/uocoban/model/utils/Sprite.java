package edu.uoc.uocoban.model.utils;

public enum Sprite {
    //WALL('#',"assets/images/wall.png"),
    WALL('#',"images/wall.png"),
    PATH('.', "images/path.png"),
    PLAYER('@', "images/player.png"),
    BIG_BOX('b', "images/big_box.png"),
    BIG_BOX_DESTINATION('B', "images/big_box_destination.png"),
    BIG_BOX_ON_DESTINATION('8', "images/big_box_on_destination.png"),
    SMALL_BOX('s', "images/small_box.png"),
    SMALL_BOX_DESTINATION('S', "images/small_box_destination.png"),
    SMALL_BOX_ON_DESTINATION('$', "images/small_box_on_destination.png");
    private final char symbol;
    private final String imageSrc;

    Sprite(char symbol, String imageSrc) {
        this.symbol = symbol;
        this.imageSrc = imageSrc;
    }

    public String getImageSrc() {
        return imageSrc;
    }

    public char getSymbol() {
        return symbol;
    }

}
