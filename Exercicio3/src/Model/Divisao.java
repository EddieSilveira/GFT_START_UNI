
package Model;

/**
 *
 * @author Eddie
 */
public class Divisao extends Operacao{

    public Divisao(double x, double y) {
        super(x, y);
    }

    @Override
    public double efetuarOperacao(double x, double y) {
        if(x == 0 || y == 0){
            System.out.println("Não é possível realizar operação");
            return 0;
        }else{
            return x / y;
        }
    }
    
}
