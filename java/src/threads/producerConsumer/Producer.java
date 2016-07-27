package threads.producerConsumer;

import java.util.Random;

/**
 * Created by gaston on 7/27/16.
 */
public class Producer implements Runnable{

    private boolean running = true;

    @Override
    public void run() {
        Random random = new Random();
        int count = 0;

        while(running) {
            try {
                Thread.sleep(random.nextInt(3000));
                Thing.getInstance().add(++count);
                System.out.println("Producer: " + Thing.getInstance().size());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //Thing.getInstance().printNumbers("Producer");
        }
    }

    public void shutDown(){
        running = false;
    }
}
