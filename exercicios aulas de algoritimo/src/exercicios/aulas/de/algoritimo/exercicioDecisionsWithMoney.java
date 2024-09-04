
package exercicios.aulas.de.algoritimo;
import java.util.Scanner;

public class exercicioDecisionsWithMoney {
    public static void main(String[] args) {
        double inss=0,ir=0,salarioBruto,salarioLiquido,qtHoras,valorHora;
        Scanner obj= new Scanner(System.in);

        System.out.println("Informe a quantidade de horas trabalhadas: ");
        qtHoras = obj.nextDouble();
        
        System.out.println("Informe o valor das horas trabalhadas: ");
        valorHora = obj.nextDouble();
        
        salarioBruto = qtHoras*valorHora;
        
        if(salarioBruto<=1000){
            inss = salarioBruto*0.08;
        }
        else{
            inss = salarioBruto*0.09;
        }
        
        if(salarioBruto<=500){
            ir = 0;
        }
        else if(salarioBruto>500 && salarioBruto<=1000){
            ir = salarioBruto * 0.06;
        }
        else if(salarioBruto>1000){
            ir = salarioBruto * 0.07;
        }
        salarioLiquido = salarioBruto - inss - ir;
        System.out.println("Seu salario bruto é " +salarioBruto);
        System.out.println("De acordo com esse salario voce pagará" +inss+ " de inss!");
        System.out.println("Voce pagará tambem " +ir+ " de Imposto de Renda!");
        System.out.println("Seu salario liquido é de: " +salarioLiquido);
    }
}
