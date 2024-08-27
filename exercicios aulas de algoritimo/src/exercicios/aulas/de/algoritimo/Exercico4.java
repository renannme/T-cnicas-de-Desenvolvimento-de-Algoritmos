
package exercicios.aulas.de.algoritimo;
import java.util.Scanner;

public class Exercico4 {
    public static void main(String[] args){
        double comida,bebidas,servico,total,consumo;
        Scanner obj= new Scanner(System.in);
        
        System.out.println("Obrigador por comer no nosso restaurante, por favor informe quanto foi seu consumo de comidas: ");
        comida = obj.nextDouble();
        System.out.println("informe quando foi seu consumo de bebidas: ");
        bebidas = obj.nextDouble();
        

        consumo = comida + bebidas;
        servico = consumo * 0.1;
        total = consumo + servico;
        
         System.out.println("sua conta deu: "+total+" incluindo a taxa de serviço!");
    }
}
