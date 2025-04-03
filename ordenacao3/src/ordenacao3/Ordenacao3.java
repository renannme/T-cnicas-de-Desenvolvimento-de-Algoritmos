package ordenacao3;

public class Ordenacao3 {

    public static void main(String[] args) {
        double v[] = {4.5,45.8,2.2,99.9,6.3,-5.6,0};
        System.out.println("vetor desordenado: ");
        visualizar(v);
        seletionSort(v);
        System.out.println("vetor ordenado: ");
        visualizar(v);
    }
    
    public static void seletionSort(double vetor[]){  //double vetor[] ou double[] vetor da no mesmo pro java
        for( int x = 0; x<vetor.length -1;x++){
            int posValorMin = x;
            for(int y = x+1; y < vetor.length; y++){
                if(vetor[y] < vetor[posValorMin]) posValorMin = y;
            }
            double temp = vetor[x];
            vetor[x] = vetor[posValorMin];
            vetor[posValorMin]=temp;
            visualizar(vetor);
        }
    }
    
    public static void visualizar(double[] vetor){
        for(double numero: vetor){
             System.out.print(numero + " ");
        }
        System.out.println();
    }
    
}
