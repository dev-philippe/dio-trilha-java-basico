package desafio_de_codigo;

import java.util.Scanner;

public class ControleSimplesDeSaques {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o limite diário de saque:");
        double limiteDiario = scanner.nextDouble();

        for (int i = 1; ; i++) {
            System.out.println("Digite o valor do saque " + i + " (ou 0 para encerrar):");
            double valorSaque = scanner.nextDouble();

            if (valorSaque == 0) {
                System.out.println("Transações encerradas.");
                break;
            }

            if (valorSaque > limiteDiario) {
                System.out.println("Valor do saque excede o limite diário. Transação não realizada.");
                break;
            } else {
                limiteDiario -= valorSaque;
                System.out.println("Saque de R$ " + valorSaque + " realizado com sucesso.");
                System.out.println("Limite diário restante: R$ " + limiteDiario);
            }
        }

        scanner.close();
    }
}
