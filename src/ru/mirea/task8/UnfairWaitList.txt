package ru.mirea.task8;

import java.util.concurrent.ConcurrentLinkedQueue;

public class UnfairWaitList<E> extends WaitList<E>{
    public UnfairWaitList(){
        super();
    }

    public void remove(E element){
        content.remove(element);
    }

    public void moveToBack(E element){
        ConcurrentLinkedQueue<E> buff;
        buff = new ConcurrentLinkedQueue<E>();
        while (!(content.peek() == element)){
            buff.add(content.remove());
        }
        content.remove();
        while (!content.isEmpty()){
            buff.add(content.remove());
        }
        buff.add(element);
        content.addAll(buff);
    }
}
