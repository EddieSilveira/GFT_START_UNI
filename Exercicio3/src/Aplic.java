

import Model.Divisao;
import Model.Multiplicacao;
import Model.Operacao;
import Model.Soma;
import Model.Subtracao;
import java.util.Scanner;

/**
 *
 * @author Eddie
 */
public class Aplic {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double x, y;
        
        System.out.println("Digite o primeiro valor: ");
        x = entrada.nextDouble();
        
        System.out.println("Digite o segundo valor: ");
        y = entrada.nextDouble();
        
        Soma sum1 = new Soma(x, y);
        Subtracao sub1 = new Subtracao(x, y);
        Divisao div1 = new Divisao(x, y);
        Multiplicacao mult1 = new Multiplicacao(x, y);
        
        System.out.println("O resultado da soma é: " + sum1.efetuarOperacao(x, y));
        System.out.println("O resultado da subtração é: " + sub1.efetuarOperacao(x, y));
        System.out.println("O resultado da divisão é: " + div1.efetuarOperacao(x, y));
        System.out.println("O resultado da multiplicação é: " + mult1.efetuarOperacao(x, y));
        
    }
    
}
