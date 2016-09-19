package reflection;

/**
 * Created by gaston on 9/18/16.
 */
public class Reflection {

    public static void main(String [] args){
        ClaseEjemplo ce =  new ClaseEjemplo();

        Class<? extends ClaseEjemplo> claseCE = ce.getClass();
        System.out.println(claseCE.getSimpleName());
    }

}
