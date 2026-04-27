package cap3;

//interface define um contrato - o que deve existir na classe que a implementa.
public interface Notificavel {
    void enviarEmail(String mensagem);

    void enviarSMS(String mensagem);

    //a classe que implementar pode sobrescrever ou usar a versão de um método default
    default void enviarWhatsapp(String mensagem){
        System.out.println("[WhatsApp] " + mensagem);
    }
    
}