package edu.uoc.uocoban.model.utils;

public enum Direction {
    DOWN(0, 1, 20),
    LEFT(-1, 0, 21),
    UP(0, -1, 19),
    RIGHT(1, 0, 22);

    Direction(int x, int y, int keyCode) {
        this.keyCode = keyCode;
        this.x = x;
        this.y = y;
    }

    private final int keyCode;
    private final int x;
    private final int y;

    public static Direction getDirectionByKeyCode(int keyCode){
        if (keyCode == 20) {
            return DOWN;
        } else if (keyCode == 21) {
            return LEFT;
        } else if (keyCode == 22) {
            return RIGHT;
        } else if (keyCode == 19) {
            return UP;
        } else return null;
    }

    public int getKeyCode() {
        return keyCode;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }


}
