package buscabinaria;
import java.util.Scanner;

public class exe1 {

    public static void main(String[] args) {
        new exe1();
    }
    
    public exe1(){
        Scanner obj = new Scanner(System.in);
        double valorTemp,valorDesejado;
        double valores[] = new double[10];
        for(int i=0;i<valores.length;i++){
            
            System.out.println("Informe um valor: ");
            valorTemp = obj.nextDouble();
            if(i==0){
                valores[i] = valorTemp;
                System.out.println("salvei a pos 0");
            }
            else if(valorTemp >= valores[i-1]){
                valores[i] = valorTemp;
                System.out.println("salvei a pos "+i);
            }
            else{
               System.out.println("valor invalido, numero precisa ser maior q o anterior ");
               i--;
            }
            
        }
        System.out.println("Informe o valor que vc deseja buscar: ");
        valorDesejado = obj.nextDouble();
        int posicao = procurarValor(valores, valorDesejado);
        if(posicao != -1){
            System.out.println("Valor encontrado na posição: "+ posicao);
        }
        else System.out.println("Valor nao encontrado!");
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
