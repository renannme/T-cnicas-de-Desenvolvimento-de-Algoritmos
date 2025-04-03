
package ordenacao3;
import java.util.ArrayList;
public class listas {
    public static void main(String[] args){
        cidades();
        System.out.println("media foi: ");
        notas();
    }
    
    public static void cidades(){
        System.out.println("Lista de cidades ---------------");
        ArrayList<String> listaCidades = new ArrayList<String>();
        listaCidades.add("São paulo");
        listaCidades.add("Santos");
        listaCidades.add("Ribeirão Preto");
        listaCidades.add(0,"campinas");
        listaCidades.add(0,"osasco");
        System.out.println(listaCidades);
        System.out.println(listaCidades.get(2));
        listaCidades.set(4,"guaruja");
        System.out.println(listaCidades);
        
        System.out.println(listaCidades.size());
        
        for(int x=0; x<listaCidades.size();x++){
            System.out.println(listaCidades.get(x));
        }
        
        for(String cidade: listaCidades){
            System.out.println(cidade);
        }
    }
    
    public static void notas(){
        ArrayList<Double> notas = new ArrayList<Double>();
        notas.add(10.0);
        notas.add(9.5);
        notas.add((double)9);
        notas.add(8.75);
        double media=0;
        
        for(int x=0; x<notas.size();x++){
            media+=notas.get(x);
        }
        
        media=media/notas.size();
        System.out.println(media);
    }
}
