package mx.edu.utng.evaluacionuno;

/**
 * Created by JntReyes on 19/01/2017.
 */
public class OperacionUno {
    private int result;
    private int valX;
    private int valY;

    private static OperacionUno operacionUno;
    public static OperacionUno getOperacionUno(){
        if (operacionUno == null) {
            operacionUno = new OperacionUno();
        }
        return operacionUno;
    }
        public OperacionUno(){
            this.valX = 0;
            this.valY = 0;
            this.result = 0;
        }

    public int getResult() {
        result = (2*valX+3*valY)* (2*valX+3*valY);
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

    public static void setOperacionUno(OperacionUno operacionUno) {
        OperacionUno.operacionUno = operacionUno;
    }
}
