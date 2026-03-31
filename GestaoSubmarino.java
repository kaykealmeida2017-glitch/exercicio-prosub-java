import java.util.Scanner;

public class GestaoSubmarino {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

            System.out.println("--- SISTEMA DE COMANDO PROSUB 2026 ---");
            System.out.println("1. Análise de Risco de Paralisação");
            System.out.println("2. Controle de Acesso ao Almirantado");
            System.out.println("3. Monitoramento de Temperatura do Reator Nuclear");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

        switch(opcao) {
            case 1:
            
            System.out.print("Digite o valor anual em bilhões(R$): ");
            double valorAnualEmBilhoes = scanner.nextDouble();

            if (valorAnualEmBilhoes < 0.5) {
                System.out.println("ALERTA: Risco de paralisação total");
            } else if (valorAnualEmBilhoes >= 0.5 && valorAnualEmBilhoes < 1.0) {
                System.out.println("RITMO LENTO: Finalização prevista para 2037");
            } else if (valorAnualEmBilhoes >= 1.0) {
                System.out.println("Projeto acelerado: Possibilidade de antecipacao de entrega");
            } break;

            case 2:
            Scanner scanner2 = new Scanner(System.in);

            System.out.print("Digite o nível de acesso(Total/Parcial): ");
            String nivelAcesso = scanner2.nextLine();

            System.out.print("Digite o seu país de origem: ");
            String paisOrigem = scanner2.nextLine();

            if (nivelAcesso.equalsIgnoreCase(  "Total") && paisOrigem.equalsIgnoreCase("Brasil")) {
                System.out.println("Acesso autorizado ao Almirantado");
            } else {
                System.out.println("ACESSO NEGADO: Soberania Nacional preservada. Dados criptografados");
            } break;

            case 3:
            Scanner scanner3 = new Scanner(System.in);

            System.out.print("Digite a temperatura do reator nuclear: ");
            double temperaturaReator = scanner3.nextDouble();

            if (temperaturaReator >= 350) {
                System.out.println("EMERGÊNCIA: Acionar sistema de resfriamento e emergência");
            } else if (temperaturaReator > 280 && temperaturaReator < 350) {
                System.out.println("Operação Normal - Cruzeiro");
            } else {
                System.out.println("Aumentar potência do reator");
            }
            break;

            default:
            System.out.println("Opção invalida. Por favor, selecione uma opção valida.");

    }
}
}



