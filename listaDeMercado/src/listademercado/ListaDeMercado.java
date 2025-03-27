package listademercado;

import java.util.Scanner;

public class ListaDeMercado {

    public static void main(String[] args) {
       new ListaDeMercado(); 
    }
    
    public ListaDeMercado(){
        String [] compras = new String[20];
        System.out.println("Digite os itens que voce vai comprar: ");
        registraItens(compras);
    }
    
    public String [] registraItens(String[] compras){
        Scanner obj = new Scanner(System.in);
        for(int i=0;i<compras.length;i++){
          System.out.println("Digite o item de numero "+ (i+1) + " da sua lista: "); 
          compras[i]=obj.nextLine();
        }
        return compras;
    }
}
