package cap5;
import java.util.*;
//coleções e generics
public class Main {
    public static void main(String[] args){
        //List - lista ordenada com dulicatas
        List<String> carrinho = new ArrayList<>();
        carrinho.add("teclado");
        carrinho.add("mouse");
        carrinho.add("teclado"); //permite duplicata
        System.out.println(carrinho.size());
        System.out.println(carrinho.get(0)); //teclado indice 0
        System.out.println(carrinho.contains("mouse"));
        carrinho.remove("teclado"); //qual ele remove? o primeiro caso achado
        System.out.println(carrinho);

        //list imutavel 
        List<String> status = List.of("PENDENTE", "PROCESSANDO", "ENTREGUE");
        // status.add(...) lançaria UnsupportedOperationException

        //SET - conjunt sem duplicata
        Set<String> categorias = new HashSet<>();
        categorias.add("Eletronicos");
        categorias.add("Roupas");
        categorias.add("Eletronicos"); // duplicata — ignorada silenciosamente
        System.out.println(categorias.size()); // 2
        System.out.println(categorias.contains("Roupas")); // true
        // TreeSet: mantém ordem alfabética automaticamente
        Set<String> ordenado = new TreeSet<>(categorias);
        System.out.println(ordenado); // [Eletronicos, Roupas]

        //MAP - pares chave-valor
        Map<String, Double> precos = new HashMap<>();
        precos.put("Teclado", 299.90);
        precos.put("Mouse", 159.90);
        precos.put("Teclado", 349.90); // substitui o valor anterior
        System.out.println(precos.get("Teclado")); // 349.90
        System.out.println(precos.containsKey("Mouse")); // true
        System.out.println(precos.getOrDefault("Monitor", 0.0)); // 0.0 (padrão)
        // Iterando sobre todas as entradas
        for (Map.Entry<String, Double> entrada : precos.entrySet()){
            System.out.printf("%s: R$ %.2f%n", entrada.getKey(), entrada.getValue());
        }
        // Com lambda (mais elegante)
        precos.forEach((produto, preco) -> System.out.printf("%s -> R$ %.2f%n", produto,preco));
    }
}
