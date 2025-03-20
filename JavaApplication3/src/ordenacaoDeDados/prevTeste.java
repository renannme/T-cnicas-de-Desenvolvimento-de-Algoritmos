
package ordenacaoDeDados;
import java.util.Scanner;

public class prevTeste {
    
    public static void main(String[] args) {
       new prevTeste();
    }
    
    public prevTeste(){
        double[] numeros = new double[10];
        Scanner entradaDados = new Scanner(System.in);
        
        for(int i=0 ; i<numeros.length;i++){
            System.out.println("Digite "+ (i+1) + " numero");
            while(true){
                double valor = entradaDados.nextDouble();
                if(buscaSequencial(numeros, valor)){
                    System.out.println("numero ja informado");
                }else{
                    numeros[i] = valor;
                    break;
                }
            }
            
        }
    }
    
    boolean buscaSequencial(double vetor[],double valor){
        for(int i=0 ; i<vetor.length;i++){
            if (vetor[i]==valor){
                return true;
            }
        }
        return false;
    }
    
   
      
}
