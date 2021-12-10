package ru.mirea.task3;

public class MovablePoint implements Movable{
    public int x;
    public int y;
    public int xSpeed;
    public int ySpeed;

    MovablePoint(int x, int y, int xSpeed, int ySpeed)
    {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public  String toString()
    {
        return "Point(" + x + ", " + y + ")";
    }
    public void moveUp()
    {
        y += 1;
    }
    public void moveDown()
    {
        y -= 1;
    }
    public void moveLeft()
    {
        x -= 1;
    }
    public void moveRight()
    {
        x += 1;
    }
}
