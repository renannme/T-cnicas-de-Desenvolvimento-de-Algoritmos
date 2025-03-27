
package buscabinaria;
import java.util.Scanner;

public class solucaoProf {
    public static void main(String[] args){
        new solucaoProf();
    }
    
    public solucaoProf(){
        exibeValores(receberValores());
        int posicao = procurarValor(receberValores(),7.5);
        if(posicao != -1){
            System.out.println("Valor encontrado na posição: "+ posicao);
        }
        else System.out.println("Valor nao encontrado!");
        
    }
    
    double[] receberValores(){ // metodo que retorna vetor
        Scanner teclado = new Scanner(System.in);
        int qtDeValores;
        System.out.println("informe quantos valores deseja digitar: ");
        qtDeValores = teclado.nextInt();
        double valores[] = new double[qtDeValores];
        double numero;
        
        for(int i=0; i<qtDeValores;i++){
            System.out.println("digite o "+(i+1)+" valor: ");
            numero = teclado.nextDouble();
            if(i==0){
               valores[i] = numero; 
            }
            else if(numero >= valores [i-1]){
               valores[i] = numero; 
            }else {
                System.out.println("valor invalido, valor precisa ser maior que o anterior ");
                i--;
            }
            
        }
        
        return valores;
    }
    void exibeValores(double[] valor){
        for(int i=0; i<valor.length;i++){
            System.out.println("o "+(i+1)+" valor é : ");
            System.out.println(valor[i]);
            
        }       
    }
    
    public int procurarValor(double vector[],double valor){
        int limiteInferior = 0;
        int limiteSuperior = vector.length -1;
        int meio;
        while(limiteInferior <= limiteSuperior){
            meio = (limiteInferior+limiteSuperior)/2;
            if(valor == vector[meio]){
                return meio;
            } else if(valor < vector[meio]){
                limiteSuperior = meio -1;              
            } else {
                limiteInferior = meio + 1;
            }
        }
        return -1;
    }
}
