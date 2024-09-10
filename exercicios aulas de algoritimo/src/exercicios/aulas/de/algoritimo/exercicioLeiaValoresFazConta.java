package exercicios.aulas.de.algoritimo;
import java.util.Scanner;

public class exercicioLeiaValoresFazConta {
    public static void main(String[] args) {
        int valorA,valorB,sinal,result;
        Scanner obj= new Scanner(System.in);
        
        System.out.println("informe um numero: ");
        valorA = obj.nextInt();
        
        System.out.println("informe outro numero: ");
        valorB = obj.nextInt();
        
        System.out.println("informe um valor maior ou igual a 10 se quiser somar e menor que 10 para subtrair: ");
        sinal = obj.nextInt();
        
        if(sinal >= 10){
            result = valorA + valorB;
            System.out.println("voce efetuou uma soma dos numeros, o valor foi de:  "+result);
        }
        else{
            result = valorA - valorB;
            System.out.println("voce efetuou uma subtração dos numeros, o valor foi de:  "+result);

        }
    }
}
