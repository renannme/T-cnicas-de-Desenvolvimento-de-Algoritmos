public class buscasequencial {
    public static void main(String[] args){
        double a[] = {4.3, 6.1, 0.1, 1.9, 2.4, 7.2, 5.5};
        int pos = buscasequencial(a,2.4);

        if (pos != -1) {
            System.out.println("Valor encontrado na posicao: " + pos);
        } else {
            System.out.println("Valor nao encontrado");
        }
    }  
    public static int buscasequencial(double vetor[], double valor ){
        int pos = -1;
       for(int i=0;i<vetor.length;i++){
           if(vetor[i] == valor){
               pos = i;
               break;
           }
       }
       return pos;
    }  
    public static int buscasequencial(double vetor[], double valor, int de, int ate ){
        int pos = -1;
       for(int i= de;i<= ate;i++){
           if(vetor[i] == valor){
               pos = i;
               break;
           }
       }
       return pos;
    }  
}
