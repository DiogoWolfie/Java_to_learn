package cap4;
import java.util.Optional;
public class ExemploOptional {
    // Retorno optional indica que esse valor pode não existir
    public static Optional<String> buscarEmail(int clienteID){
        if (clienteID == 1){
            return Optional.of("anna@gmail.com"); //valor presente
        }
        return Optional.empty(); //sem valor
    }
    public static void main(String[] args){
        Optional<String> email = buscarEmail(1); //o objeto também precisa ser optional
        Optional<String> semEmail = buscarEmail(666);
        //executar o código só se o valor estiver presente
        email.ifPresent(e -> System.out.println("email encontrado: " + e));

        //transofrmar o valor presente
        String emailMaisuculo = email.map(String::toUpperCase).orElse("EMAIL INEXISTENTE");
        System.out.println(emailMaisuculo);

        //lançar excessão se tiver auxente, devolve o email se tiver presente
        String emailObrigatorio = email.orElseThrow(() -> new RuntimeException("Cliente sem email!"));
        System.out.println(emailObrigatorio);

        //para email inexistente
        String contato = semEmail.orElseGet(()->"contado@empresa.com");
        System.out.println(contato);

        // String teste = semEmail.orElse("contato@empresa.com");
        // System.out.println(teste);
        
    }   
}
