
package Model;


/**
 *
 * @author Eddie
 */
public class Circulo implements AreaCalculavel{
    private double raio;
    private double pi = ((int) (Math.PI * 100)) / 100.0;


    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    @Override
    public void calculaArea() {
         System.out.println("Área do Circulo: " + this.getPi()* Math.pow(this.raio, 2));
    }
}
