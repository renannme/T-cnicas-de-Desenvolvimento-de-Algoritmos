/*
 acima de 10 ta frio, abaixo de 10 da quente
 */
package tigrinho;
import java.util.Random;
import java.util.Scanner;

public class advinheNumero {
    public static void main(String[] args) {
        
        new advinheNumero();
    }
    public advinheNumero(){
        Scanner obj = new Scanner(System.in);
        int sorteado = sorteio();
        System.out.println("resposta: "+sorteado);
        int numeroInformado;
        int falhou = 0;
        for(int i =0; i<9;i++){
            System.out.println("digite um numero: ");
            numeroInformado = obj.nextInt();
            if(sorteado==numeroInformado){
                System.out.println("Parabens você ganhou: NADA");
                falhou =1;
                break;
            }else if(sorteado>numeroInformado){
                if(sorteado>numeroInformado+10)
                System.out.println("Numero é maior que esse e vc esta frio");
                else System.out.println("Numero é maior que esse e vc esta quente");
            }else if(sorteado<numeroInformado){
                if(sorteado>numeroInformado-10)
                System.out.println("Numero é menor que esse e vc esta frio");
                else System.out.println("Numero é menor que esse e vc esta quente");
            }
        }
        if(falhou == 0){
            System.out.println("você falou nas 5 tentativas");
        }
    }
    
    public int sorteio(){
        Random rnd = new Random();
        int n1;
        n1 = rnd.nextInt(100);
        return(n1);
       
    }
}
//int diferenca = Math.abs(this.numeroSorteado - tentativa);