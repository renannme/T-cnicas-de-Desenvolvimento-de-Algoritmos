
package exercicios.aulas.de.algoritimo;
import java.util.Scanner;

public class exercicioMultas {
     public static void main(String[] args) {
        int velocidadeVeiculo,velocidadePista, diferencaVelocidade,valorMulta;
        Scanner obj= new Scanner(System.in);

        System.out.println("informe a velocidade do veiculo: ");
        velocidadeVeiculo = obj.nextInt();
        
        System.out.println("informe a velocidade máxima da pista: ");
        velocidadePista = obj.nextInt();
        
        diferencaVelocidade = velocidadeVeiculo - velocidadePista;
        if(diferencaVelocidade>0){
            if(diferencaVelocidade<=10){
                valorMulta = 50;
                System.out.println("A velocidade maxima dessa pista é "+velocidadePista); 
                System.out.println("O veiculo estava a "+diferencaVelocidade+"km acima da velocidade permitida");
                System.out.println("Motorista recebe uma multa de "+valorMulta+ " R$!"); 
            }
            if(diferencaVelocidade>=10 && diferencaVelocidade<=30){
                valorMulta = 100;
                System.out.println("A velocidade maxima dessa pista é "+velocidadePista); 
                System.out.println("O veiculo estava a "+diferencaVelocidade+"km acima da velocidade permitida");
                System.out.println("Motorista recebe uma multa de "+valorMulta+ " R$!"); 
            }
            if(diferencaVelocidade>20 && diferencaVelocidade<=30){
                valorMulta = 200;
                System.out.println("A velocidade maxima dessa pista é "+velocidadePista); 
                System.out.println("O veiculo estava a "+diferencaVelocidade+"km acima da velocidade permitida");
                System.out.println("Motorista recebe uma multa de "+valorMulta+ " R$!"); 
            }
        }
        else {
           System.out.println("A velocidade é correta para essa pista, sem multa!"); 
        }
     }
}
