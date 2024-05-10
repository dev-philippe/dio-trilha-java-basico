package desafio_de_codigo;

import java.util.Scanner;

public class SimulacaoBancaria {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double saldo = 0.0;
        // Loop infinito para manter o programa em execução até que o usuário decida sair
        boolean continuar = true;
        while (continuar) {
            System.out.println("Escolha uma opção: ");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Consultar Saldo");
            System.out.println("0. Encerrar");

            int opcao = teclado.nextInt();
            // Implementando as operações com base na opção escolhida
            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor a ser depositado: ");
                    double depositado = teclado.nextDouble();
                    saldo += depositado;
                    System.out.println("Depósito de R$ " + depositado + " realizado com sucesso.");
                    break;
                case 2:
                    System.out.println("Digite o valor a ser sacado: ");
                    double saque = teclado.nextDouble();
                    if (saque > saldo) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        saldo -= saque;
                        System.out.println("Saque de R$ " + saque + " realizado com sucesso.");
                    }
                    break;
                case 3:
                    System.out.println("Saldo atual: R$ " + saldo);
                    break;
                case 0:
                    continuar = false; // Para sair do loop e encerrar o programa
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
            }
        }

        teclado.close();
    }
}



