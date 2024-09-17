
package stringclass;
import java.util.Scanner;

public class StringClass {

    public static void main(String[] args) {
        String sexo;
        Scanner obj= new Scanner(System.in);
        double salario,anosDeTrabalho;
       
        System.out.println("informe seu sexo:(masculino) ou (feminino)");
        sexo = obj.nextLine();
        
        System.out.println("informe quantos anos trabalha na empresa:");
        anosDeTrabalho = obj.nextDouble();
        
        System.out.println("informe seu salario:");
        salario = obj.nextDouble();
        
        if(sexo.equals("masculino") && anosDeTrabalho>15){
            salario = salario+(salario*0.15);
        }
        else if(sexo.equals("feminino") && anosDeTrabalho>10){
            salario = salario+(salario*0.30);
        }
        else {
            salario = salario + 500;
        }
        System.out.println("com essas informações seu salario é de: "+salario);
    }
    
}
