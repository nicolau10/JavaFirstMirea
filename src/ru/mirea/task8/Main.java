package ru.mirea.task8;

public class Main {
    public static void main(String[] args) {
        WaitList<Integer> one = new WaitList<Integer>();
        BoundedWaitList<Integer> two = new BoundedWaitList<Integer>(5);
        UnfairWaitList<Integer> three = new UnfairWaitList<Integer>();
        for (int i = 0; i < 6; i++){
            one.add(i);
            two.add(i);
            three.add(i);
        }
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println();

        three.remove(3);
        System.out.println(three);
        three.moveToBack(2);
        System.out.println(three);
    }
}
