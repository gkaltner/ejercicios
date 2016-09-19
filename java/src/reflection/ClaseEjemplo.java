package reflection;

/**
 * Created by gaston on 9/18/16.
 */
public class ClaseEjemplo {
    public String unaVariableString = "Un Texto";
    private int unaVariableInt = 5;

    public String getUnaVariableString(String concatenar) {
        return unaVariableString + concatenar;
    }

    private int getUnaVariableInt(int suma) {
        return unaVariableInt + suma;
    }
}
