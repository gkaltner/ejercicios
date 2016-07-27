package threads.producerConsumer;

/**
 * Created by gaston on 7/27/16.
 */
public class Main {

    public static void main(String []args){
        Producer proc = new Producer();
        Thread tProc = new Thread(proc);
        Consumer com = new Consumer();
        Thread tCom = new Thread(com);

        tProc.start();
        tCom.start();


    }
}
