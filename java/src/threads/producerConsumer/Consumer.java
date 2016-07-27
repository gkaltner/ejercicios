package threads.producerConsumer;

import java.util.Random;

/**
 * Created by gaston on 7/27/16.
 */
public class Consumer implements Runnable{

    private boolean running = true;

    @Override
    public void run() {
        Random random = new Random();
        while(running) {
            try {
                Thread.sleep(random.nextInt(3000));
                Thing.getInstance().get();
                System.out.println("Consumer: " + Thing.getInstance().size());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //Thing.getInstance().printNumbers("Consumer");
        }
    }

    public void shutDown(){
        running = false;
    }
}
