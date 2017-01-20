package mx.edu.utng.evaluacionuno;

/**
 * Created by JntReyes on 19/01/2017.
 */
public class OperacionDos {
    private int result;
    private int valX;
    private int valY;

    private static OperacionDos operacionDos;
    public static OperacionDos getOperacionDos(){
        if (operacionDos == null) {
            operacionDos = new OperacionDos();
        }
        return operacionDos;
    }
    public OperacionDos(){
        this.valX = 0;
        this.valY = 0;
        this.result = 0;
    }

    public int getResult() {
        result = (4*valX-5*valY)* (4*valX-5*valY);
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public int getValX() {
        return valX;
    }

    public void setValX(int valX) {
        this.valX = valX;
    }

    public int getValY() {
        return valY;
    }

    public void setValY(int valY) {
        this.valY = valY;
    }

}
