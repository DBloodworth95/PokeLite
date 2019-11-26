package com.dan.pokemon.player;

public class Actor {

    private int x;
    private int y;

    public Actor(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public int setX(int x) {
        this.x = x;
        return x;
    }
    public int setY(int y) {
        this.y = y;
        return y;
    }
}
