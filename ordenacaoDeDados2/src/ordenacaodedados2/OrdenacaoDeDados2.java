
package ordenacaodedados2;

public class OrdenacaoDeDados2 {

    public static void main(String[] args) {
        new OrdenacaoDeDados2();
    }
    
    public OrdenacaoDeDados2(){
        int[] numeros = {2,3,41,6,8,55};
        System.out.println("vetor desordenado: ");
        visualizar(numeros);
        System.out.println("vetor ordenado: ");
        insertionSort(numeros);
        
    }
    void visualizar(int[] numeros){
        for(int num: numeros){
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    void insertionSort(int[] array){
        for(int i = 1; i < array.length; i++){
            int numeroEmOrdenacao = array[i];
            int j = i-1;
            
            while (j >= 0 && array[j] > numeroEmOrdenacao){
                array[j+1] = array[j];
                j--;
            }
            
            array[j+1]=numeroEmOrdenacao;
        }
        for(int num: array){
            System.out.print(num + " ");
        }
    }
}
