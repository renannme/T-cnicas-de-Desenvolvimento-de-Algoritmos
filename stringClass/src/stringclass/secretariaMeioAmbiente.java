
package stringclass;
import java.util.Scanner;

public class secretariaMeioAmbiente {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        double IDP;
        
        System.out.println("informe o indice de poulição: (IDP)");
        IDP = obj.nextDouble();
        
        if(IDP<0.3){
            System.out.println("Niveis de poluição normal.");           
        }
        else if(IDP>=0.3 && IDP<0.4){
            System.out.println("Alerta! indice de poulição moderado, suspender atividades das industrias do grupo 1");
        }
        else if(IDP>=0.4 && IDP<0.5){
            System.out.println("Alerta! indice de poulição alto, suspender atividades das industrias do grupo 1 e do grupo 2");
        }
        else{
            System.out.println("Alerta! indice de poulição Critico, suspender atividades de todas as industrias");
        }
    }
}
