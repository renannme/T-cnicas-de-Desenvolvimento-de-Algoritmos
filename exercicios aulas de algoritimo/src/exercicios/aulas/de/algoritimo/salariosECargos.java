
package exercicios.aulas.de.algoritimo;
import java.util.Scanner;

public class salariosECargos {
    public static void main(String[] args) {
        int codigo;
        double salario;
        Scanner obj= new Scanner(System.in);
        
        System.out.println("informe seu salario atual: ");
        salario = obj.nextDouble();
        
        System.out.println("informe seu cargo atual: ");
        codigo = obj.nextInt();
        
        if(codigo == 1){
            salario = salario + salario * 0.5;
            System.out.println("Seu novo cargo é escriturário");
            System.out.println("salario atual: "+salario);
        }
        if(codigo == 2){
            salario = salario + salario * 0.35;
            System.out.println("Seu novo cargo é secretario");
            System.out.println("salario atual: "+salario);
        }
        if(codigo == 3){
            salario = salario + salario * 0.2;
            System.out.println("Seu novo cargo é caixa");
            System.out.println("salario atual: "+salario);
        }
        if(codigo == 4){
            salario = salario + salario * 0.1;
            System.out.println("Seu novo cargo é gerente");
            System.out.println("salario atual: "+salario);
        }
        if(codigo == 5){
            System.out.println("Seu novo cargo é diretor");
            System.out.println("salario atual: "+salario);
        }
    }
}
