package threads.producerConsumer;

import java.util.LinkedList;

/**
 * Created by gaston on 7/27/16.
 */
public class Thing {

    private static Thing instance = null;

    private LinkedList queue =  new LinkedList<>();

    public synchronized static Thing getInstance(){
        if(instance == null){
            instance = new Thing();
        }
        return instance;
    }

    public synchronized void add(Object item) throws InterruptedException {
        while(queue.size() >= 5){
            wait();
        }
        this.queue.add(item);
        notify();
    }

    public synchronized Object get() throws InterruptedException{
        while(queue.size() <= 0){
            wait();
        }
        Object obj = this.queue.removeFirst();
        notify();
        return obj;
    }

    public LinkedList getQueue(){
        return queue;
    }

    public int size(){
        return this.queue.size();
    }

    public void printNumbers(String name){

        for (int i = 0; i < 15; i++) {
            System.out.println(name + ": " + i);
        }

    }
}
