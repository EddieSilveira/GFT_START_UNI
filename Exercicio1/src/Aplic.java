
import java.util.Scanner;

/**
 *
 * @author Eddie
 */
public class Aplic {

    public static void main(String[] args) {
        int num, inicio, fim; 
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Multiplicando:");
        num = entrada.nextInt(); 
        if(num < 0 || num > 3000){
            System.out.println("Insira um Multiplicando válido!");
            System.exit(0);
        }
        
        System.out.print("Início do intervalo:");
        inicio = entrada.nextInt();
        if(inicio < 0 || inicio > 3000){
            System.out.println("Digite um início válido!");
            System.exit(0);
        }
        
        System.out.print("Fim do intervalo:");
        fim = entrada.nextInt();
         if(fim < 0 || fim > 3000){
            System.out.println("Digite um fim válido!");
            System.exit(0);
        }
         
         if(fim > inicio + 9){
             System.out.println("Intervalo inválido!");
             System.exit(0);
         }
         
         if(inicio >= fim){
             System.out.println("O inicio do intervalo deve ser menor que seu fim!");
             System.exit(0);
         }
        for(int i = inicio; i <= fim; i++){
            System.out.println(num + " x " + i + " = " + num * i);
        }   
    }
}
