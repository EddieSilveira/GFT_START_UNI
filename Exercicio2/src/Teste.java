
import Model.Circulo;
import Model.Quadrado;
import Model.Retangulo;


/**
 *
 * @author eddie
 */
public class Teste {

    public static void main(String[] args) {
        Circulo c1 = new Circulo(20);
        Quadrado q1 = new Quadrado(20);
        Retangulo r1 = new Retangulo(20, 10);
        
        c1.calculaArea();
        q1.calculaArea();
        r1.calculaArea();
      
    }
    
}
