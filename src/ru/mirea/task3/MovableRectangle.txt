package ru.mirea.task3;

public class MovableRectangle implements Movable{
    public MovablePoint a, b, c, d;

    MovableRectangle(int x, int y, int xSpeed, int ySpeed){
        this.a = new MovablePoint(x, y, xSpeed, ySpeed);
        this.b = new MovablePoint(x, y, xSpeed, ySpeed);
        this.c = new MovablePoint(x, y, xSpeed, ySpeed);
        this.d = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    public String toString(){
        return "Rectangle((" + a.x + ", " + a.y + "), (" + b.x + ", " + b.y + "), (" + c.x + ", " + c.y + "), (" + d.x + ", " + d.y + ")";
    }

    @Override
    public void moveUp() {
        a.moveUp();
        b.moveUp();
        c.moveUp();
        d.moveUp();
    }

    @Override
    public void moveDown() {
        a.moveDown();
        b.moveDown();
        c.moveDown();
        d.moveDown();
    }

    @Override
    public void moveLeft() {
        a.moveLeft();
        b.moveLeft();
        c.moveLeft();
        d.moveLeft();
    }

    @Override
    public void moveRight() {
        a.moveRight();
        b.moveRight();
        c.moveRight();
        d.moveRight();
    }
}
