package exemplos;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String args[]) {
        // Exemplo 1: Runnable!
        Runnable rAntigo = new Runnable(){

            @Override
            public void run() {
                // TODO Auto-generated method stub
                System.out.println("Método antigo");
            }
        };
        
        
        System.out.println("Teste antes");
        Runnable rNovo = ()->(System.out.println("Método novo!"));
        rNovo.run();
        
        
        // Exemplo 2: Comparator, type inference e bloco!
        
        Comparator<String> c = (esq, dir) -> {
            System.out.println("Estou comparando:" + esq + " a " + dir);
            return esq.compareTo(dir);
        };
        
        int result = c.compare("A", "Z");
        
        
        // Exemplo 3: Runnable e type inference
        
        // Object o = () -> System.out.println("Essa porcaria nao compila");
        // não compila porque não se sabe qual interface funcional deve ser chamada!
        
        Object o = (Runnable)() -> System.out.println("Essa porcaria nao compila");
        ((Runnable) o).run(); //<<< bizarro!
        
        
        // Exemplo 4: Imprimir uma lista
        List<Integer> inteiros = Arrays.asList(1,2,3,4,5);
        for(Integer numeroDaLista:inteiros)
            System.out.println(numeroDaLista);
        
        // com lambda...
        inteiros.forEach((x)->System.out.println(x));
        inteiros.forEach( x ->System.out.println(x));
        
        
        
    }
    
}
