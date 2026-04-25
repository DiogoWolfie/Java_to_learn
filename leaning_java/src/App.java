public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        String diaSemana = "Segunda";

        String tipo = switch(diaSemana){
            case "Segunda", "Terça", "Quarta", "Quinta", "Sexta" -> "Dia útil";
            case "Sabado", "Domingo" -> "Final de Semana";
            default -> "Dia inválido";
        };

        System.out.println(tipo);
    }
}
