package exercicios.aulas.de.algoritimo;

import java.util.Scanner;

public class Exercicio5 {
     public static void main(String[] args){
        int numero1,numero2,soma,multiplicacao,subtracao,divisao,resto;
        Scanner obj= new Scanner(System.in);
        
        System.out.println("insira o primeiro número: ");
        numero1 = obj.nextInt();
        System.out.println("insira o segundo número: ");
        numero2 = obj.nextInt();
        
        soma = numero1 + numero2;
        multiplicacao = numero1 * numero2;
        subtracao = numero1 - numero2;
        divisao = numero1 / numero2;
        resto = numero1 % numero2;
        
        
         System.out.println("A soma dos números deu : "+soma);
         System.out.println("A multiplicação dos números deu : "+multiplicacao);
         System.out.println("A subtração dos números deu : "+subtracao);
         System.out.println("A divisão dos números deu : "+divisao);
         System.out.println("e o resto dessa divisão foi : "+resto);
         


    }
}
