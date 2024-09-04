
package exercicios.aulas.de.algoritimo;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        double quantidade1,valor1,quantidade2,valor2,quantidade3,valor3,subtotal1,subtotal2,subtotal3,total;
        Scanner obj= new Scanner(System.in);
        
        System.out.println("informe a quantidade do primeiro produto:");
        quantidade1 = obj.nextDouble();
        
        System.out.println("informe o valor unitário do primeiro produto:");
        valor1 = obj.nextDouble();
        
        System.out.println("informe a quantidade do segundo produto:");
        quantidade2 = obj.nextDouble();
        
        System.out.println("informe o valor unitário do segundo produto:");
        valor2 = obj.nextDouble();
        
        System.out.println("informe a quantidade do terceiro produto:");
        quantidade3 = obj.nextDouble();
        
        System.out.println("informe o unitário do terceiro produto:");
        valor3 = obj.nextDouble();
        
        subtotal1 = quantidade1*valor1;
        subtotal2 = quantidade2*valor2;
        subtotal3 = quantidade3*valor3;
        
        total = subtotal1+subtotal2+subtotal3;
        
        System.out.println("o subtotal do primeiro produto foi: "+subtotal1);
        System.out.println("o subtotal do segundo produto foi: "+subtotal2);
        System.out.println("o subtotal do terceiro produto foi: "+subtotal3);
        System.out.println("o total dos produtos foi: "+total);
    }
}
