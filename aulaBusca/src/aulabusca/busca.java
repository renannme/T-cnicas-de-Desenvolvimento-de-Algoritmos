
package aulabusca;

public class busca {
    public static void main(String[] args) {
        new busca();
    }
    
    public busca(){
        double a[] = {10,20,4.3,3.2,-1,-2};
        visualizarVetor("vetor de valores reais",a);
        calculaSoma("A soma de tds os numeros do vetor é: ", a);
        calculaSomaPositivo("a soma dos numeros positivos é: ", a);
        boolean pesquisa = localizaValor(a,30);
        
        if(pesquisa)System.out.println("Valor localizado!");
        else System.out.println("Valor não localizado!");
    }
    
    public void visualizarVetor(String mensagem, double ver[]){
        System.out.println(mensagem);
        for(int i=0;i<ver.length;i++){
            System.out.print(ver[i]+" || ");
        }
        System.out.println();
    }
    
    public void calculaSoma(String mensagem, double ver[]){
        System.out.println(mensagem);
        double soma=0;
        for(int i=0;i<ver.length;i++){
            soma += ver[i];
        }
        System.out.println(soma);
    }
    public void calculaSomaPositivo(String mensagem, double ver[]){
        System.out.println(mensagem);
        double soma=0;
        for(int i=0;i<ver.length;i++){
            if(ver[i]>0){
                soma += ver[i];
            }
        }
        System.out.println(soma);
    }
    
    boolean localizaValor(double a[], double value){
        boolean resposta = false;
        for(int i=0;i<a.length;i++){
            if(a[i]==value){
                resposta = true;
                break;
            }
        }
        return resposta;
    }
}
