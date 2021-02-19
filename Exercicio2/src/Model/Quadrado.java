
package Model;

/**
 *
 * @author Eddie
 */
public class Quadrado implements AreaCalculavel{
    public double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
      
    @Override
    public void calculaArea(){
        System.out.println("Área do Quadrado: " + this.getLado() * this.getLado());
    }
}
