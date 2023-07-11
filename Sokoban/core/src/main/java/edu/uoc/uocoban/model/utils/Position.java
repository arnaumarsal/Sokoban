package edu.uoc.uocoban.model.utils;

import java.util.Objects;

public class Position {
    private int x;
    private int y;

    public Position(int x, int y) {
        setX(x);
        setY(y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    @Override
    public boolean equals(Object other){
        return this.getX() == ((Position) other).getX() && this.getY() == ((Position) other).getY();
    }
    @Override
    public int hashCode() {
        int h1 = Objects.hashCode(x);
        int h2 = Objects.hashCode(y);
        return h1*h2;

    }

    @Override
    public String toString() {
        String xRet = Integer.toString(this.getX());
        String yRet = Integer.toString(this.getY());
        return xRet + "," + yRet;
    }
}
