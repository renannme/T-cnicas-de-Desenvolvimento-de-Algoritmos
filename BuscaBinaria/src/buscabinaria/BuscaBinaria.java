
package buscabinaria;

public class BuscaBinaria {

    public static void main(String[] args) {
        new BuscaBinaria();
    }
    
    public BuscaBinaria(){
        double valores[] = {4.3 , 6.1, 7.1, 8.9, 9.4, 9.6, 10.5};
        int posicao = procurarValor(valores, 9.4);
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
