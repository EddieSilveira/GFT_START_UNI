
package Model;

/**
 *
 * @author Eddie
 */
public abstract class Operacao {
    private double x, y;

    public Operacao(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public abstract double efetuarOperacao(double x, double y);
}
