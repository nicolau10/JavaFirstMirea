package ru.mirea.task3;

public class Test {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(0,0,1,1);
        System.out.println(point);
        point.moveUp();
        point.moveRight();
        System.out.println(point);
        point.moveDown();
        point.moveLeft();
        System.out.println(point);
        point.moveDown();
        point.moveLeft();
        System.out.println(point);
        MovableRectangle rectangle = new MovableRectangle(2, 3, 4, 5);
        System.out.println(rectangle);
        rectangle.moveRight();
        rectangle.moveDown();
        System.out.println(rectangle);
    }
}
