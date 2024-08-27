
package exercicios.aulas.de.algoritimo;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args){
        double numero1,numero2,numero3,numero4,total;
        Scanner obj= new Scanner(System.in);
        
        System.out.println("informe o primeiro numero:");
        numero1 = obj.nextDouble();
        System.out.println("informe o segundo numero:");
        numero2 = obj.nextDouble();
        System.out.println("informe o terceiro numero:");
        numero3 = obj.nextDouble();
        System.out.println("informe o quarto numero:");
        numero4 = obj.nextDouble();
        
        total = numero1 + numero2 + numero3 + numero4;
        total = total/4;
        
         System.out.println("A media aritmétrica dos 4 números foi: "+total);
    }
}
