package cap4;
//um Record é uma classe especial que gera todo o boilerplate (código repetitivo e que não agrega lógica real)
//automaticamente.
//O java gera contrutor, getters, toString, equals e hashcode.
public record exemploRecords(String rua, String cidade, String cep) {
    // Construtor compacto: valida os dados na criação
    // Não precisa de 'this.rua = rua' — o Record faz isso sozinho
    public exemploRecords{
        if(cep == null || cep.isBlank()){
            throw new IllegalArgumentException("CEP é obrigatório");

        }

        cep = cep.replaceAll("[^0-9]", "");
    }

    //posso adicionar métodos normais também
    public String formatado(){
        return rua + ", " + cidade + ", " + cep;
    }

    //então, em um recods eu não posso criar um método como:
    // public void alteraRua(String rua){
    //     this.rua = rua;
    // }

    public static void main(String[] args){
        // Uso do Record:
        exemploRecords end = new exemploRecords("Rua das Flores, 123", "Sao Paulo", "01310-100");
        System.out.println(end.rua()); // getter: nome do campo (sem 'get')
        System.out.println(end.cidade()); // Sao Paulo
        System.out.println(end.formatado()); // Rua das Flores, 123, Sao Paulo - 01310100
        System.out.println(end); // toString() gerado: Endereco[rua=..., ...]
    }
}

/* Mas porque então não usar records sempre no lugar de classes normais?
Records são imutáveis por design (campos finais). Se você precisa alterar o estado de um objeto várias vezes durante
o seu ciclo de vida (ex: um objeto Usuario onde você precisa alterar o nome ou senha depois de criado), uma classe 
comum é necessária. 

Records podem implementar interfaces, mas não podem fazer herança de classes.
*/

