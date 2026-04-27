package cap4;
import java.util.*;
import java.util.function.*;

public class ExemplosLambda {
    public static void main(String[] args){
        List<String> nomes = Arrays.asList("Carlos", "ana", "Bruno", "Noemi");

        //antes do java 8 precisava criar uma classe anônima inteira assim:
        nomes.sort(new Comparator<String>(){
            @Override
            public int compare(String a, String b){
                return a.compareTo(b);
            }
        });

        //Com lambda: muito mais conciso - (a,b) -> corpo
        nomes.sort((a,b) -> a.compareTo(b));

        // AINDA MAIS CONCISO com Method Reference (referência a método)
        // Sintaxe: Classe::método — Java passa os argumentos automaticamente
        nomes.sort(String::compareTo);

        //interfaces funcionais na prática
        //Predicate: recebe algo, retorna boolean
        Predicate<String> nomeGrande = nome -> nome.length() > 4;

        //Function: recebe T, transforma em R
        Function<String,String> emMaiusculo = String::toUpperCase;

        //Consumer: recebe algo, mas não retorna nada
        Consumer<String> imprimir = System.out::println;

        //Supplier: não recebe nada, fornece um valor
        Supplier<String> saudacao = () -> "olá, mundo";

        // Usando tudo junto:
        //Stream é uma sequencia de elementos que podem ser processados de forma encadeade e declarativa
        nomes.stream()
        .filter(nomeGrande) // filtra nomes com mais de 4 letras
        .map(emMaiusculo) // transforma para maiúsculas
        .forEach(imprimir); // imprime cada um
        System.out.println(saudacao.get()); // Ola

    }
}
