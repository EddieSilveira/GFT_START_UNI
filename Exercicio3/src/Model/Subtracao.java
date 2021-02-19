
package Model;

/**
 *
 * @author Eddie
 */
public class Subtracao extends Operacao{

    public Subtracao(double x, double y) {
        super(x, y);
    }

    @Override
    public double efetuarOperacao(double x, double y) {
        return x - y;
    }
    
}
