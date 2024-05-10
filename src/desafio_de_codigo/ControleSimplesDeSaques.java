package desafio_de_codigo;

import java.util.Scanner;

public class ControleSimplesDeSaques {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o limite diário de saque:");
        double limiteDiario = scanner.nextDouble();

        // Loop while para iterar sobre os saques
        while (true) {
            System.out.println("Digite o valor do saque (ou 0 para encerrar):");
            double valorSaque = scanner.nextDouble();

            // Verifica se o valor do saque é zero, encerrando as transações
            if (valorSaque == 0) {
                System.out.println("Transações encerradas.");
                break;
            }

            // Verifica se o valor do saque ultrapassa o limite diário
            if (valorSaque > limiteDiario) {
                System.out.println("Valor do saque excede o limite diário. Transação não realizada.");
            } else {
                // Se o valor do saque não ultrapassar o limite diário, subtrai o valor do saque do limite diário
                limiteDiario -= valorSaque;
                System.out.println("Saque de R$ " + valorSaque + " realizado com sucesso.");
                System.out.println("Limite diário restante: R$ " + limiteDiario);
            }
        }

        // Fechamos o Scanner para evitar vazamento de recursos
        scanner.close();
    }
}



