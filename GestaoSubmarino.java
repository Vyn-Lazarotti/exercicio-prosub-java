import java.util.Scanner;

public class GestaoSubmarino {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Este algoritmo simula um sistema de gestão do programa de desenvolvimento de submarinos");

        System.out.println("Primeira situação: Orçamento e cronograma");
        System.out.println("Insira o valor do repasse anual (equivale a bilhões de reais): ");
        double valor = teclado.nextDouble();
        teclado.nextLine();
        if (valor < 0.5) {
            System.out.println("ALERTA: Risco de paralisação total. Data estimada: 2045");
        } else if (valor > 1.0) {
            System.out.println("Projeto acelerado: Possibilidade de antecipação da entrega\"");
        } else {
            System.out.println("Ritmo lento: Finalização prevista para 2037");
        }

        System.out.println("Segunda situação: Protocolo de Acesso Internacional");
        String acesso = "Total";
        String country = "Brasil";
        System.out.println("Insira o nível de acesso: ");
        String primeiraSenha = teclado.next();
        System.out.println("Insira o país: ");
            String segundaSenha = teclado.next();
        if (acesso.equalsIgnoreCase(primeiraSenha)) {
            if (country.equalsIgnoreCase(segundaSenha)) {
                System.out.println("Acesso autorizado ao Almirantado");
            } else {
                System.out.println("ACESSO NEGADO: Soberania Nacional preservada. Dados criptografados");
            }
        }

        System.out.println("Terceira situação: Propulsão (Simulação de Segurança)");
        System.out.println("Insira a temperatura do reator (em graus celsius): ");
        double temperatura = teclado.nextDouble();
        if (temperatura < 280.0) {
            System.out.println("Aumentar potência do reator");
        } else if (temperatura > 350.0) {
            System.out.println("EMERGÊNCIA: Acionar sistema de resfriamento e emergência");
        } else {
            System.out.println("Operação Normal - Cruzeiro");
        }

        System.out.println("Encerrando simulação");
        
        teclado.close();
    }
}
