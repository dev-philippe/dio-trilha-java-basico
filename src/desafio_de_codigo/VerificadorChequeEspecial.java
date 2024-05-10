package desafio_de_codigo;

import java.util.Scanner;

public class VerificadorChequeEspecial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o saldo disponível na conta:");
        double saldo = scanner.nextDouble();

        System.out.println("Digite o valor do saque:");
        double saque = scanner.nextDouble();

        double limiteChequeEspecial = 500;

        // Verifica se o saque não ultrapassa o saldo disponível na conta
        if (saque <= saldo) {
            System.out.println("Saque aprovado. Transação realizada com sucesso.");
        } else {
            // Verifica se o saque ultrapassa o limite do cheque especial, mas não o saldo total disponível
            if (saque <= saldo + limiteChequeEspecial) {
                System.out.println("Saque aprovado. Transação realizada com uso do cheque especial.");
            } else {
                // Se o saque ultrapassar tanto o saldo disponível quanto o limite do cheque especial
                System.out.println("Transação não realizada. Limite do cheque especial excedido.");
            }
        }

        // Fechamos o objeto Scanner para liberar os recursos:
        scanner.close();
    }
}


