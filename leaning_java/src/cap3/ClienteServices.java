package cap3;
//perceba que a classe implementa a interface, e não a herda
public class ClienteServices implements Notificavel, Auditavel {
    
    // Uma classe pode implementar VÁRIAS interfaces ao mesmo tempo
    // Ela é obrigada a fornecer o corpo de todos os métodos não-default
    @Override
    public void enviarEmail(String mensagem) {
        System.out.println("[Email] " + mensagem);
        // Aqui entraria a lógica real de envio (ex: JavaMail, SendGrid)
    }

    @Override
    public void enviarSMS(String mensagem) {
        System.out.println("[SMS] " + mensagem);
    }
    @Override
    public void registrarLog(String acao) {
        System.out.println("[LOG] " + acao);
    }
}
