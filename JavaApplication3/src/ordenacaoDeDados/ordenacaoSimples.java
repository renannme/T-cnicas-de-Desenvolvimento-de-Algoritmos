package ordenacaoDeDados;


public class ordenacaoSimples {

    public static void main(String[] args) {
        new ordenacaoSimples();
    }
    
    public ordenacaoSimples(){
        double vet[] = {4.5,6.3,1.2,78.3,0.15,4.3};
        exibirValores(vet);
        ordenar(vet);
    }
    
    void ordenar(double vetor[]){
        boolean fOrdenado = false;
        while(!fOrdenado){
           fOrdenado = true;
           for(int i = 0; i<vetor.length-1;i++){
                if(vetor[i] > vetor[i+1]){
                    double tmp = vetor[i];
                    vetor[i] = vetor[i+1];
                    vetor[i+1] = tmp;
                    fOrdenado = false;
                }
            }           
        }
        System.out.println("Os valores ordenados foram: ");
        for (int i =0; i< vetor.length;i++){
            System.out.print(vetor[i] +" || ");
        }
        System.out.println();
        
    }
    
    void exibirValores(double[] valores){
        System.out.println("Os valores inseridos foram: ");
        for (int i =0; i< valores.length;i++){
            System.out.print(valores[i] +" || ");
        }
        System.out.println();
    }
}
