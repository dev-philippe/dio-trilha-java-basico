package desafio_de_codigo;

import java.util.Scanner;

public class VerificadorNumeroConta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Leitura da entrada do usuário como uma string representando o número da conta:
            System.out.println("Digite o número da conta:");
            String numeroConta = scanner.nextLine();

            // Chamada do método verificarNumeroConta, passando o número da conta como argumento:
            verificarNumeroConta(numeroConta);

            // Se nenhum erro ocorrer, imprime que o número de conta é válido:
            System.out.println("Número de conta válido.");

        } catch (IllegalArgumentException e) {
            // Captura da exceção do tipo IllegalArgumentException, que pode ser lançada pelo método verificarNumeroConta:
            // Aqui é impressa uma mensagem de erro, mostrando a mensagem associada à exceção:
            System.out.println("Erro: " + e.getMessage());

        } finally {
            scanner.close();
        }
    }

    // Método verificarNumeroConta, que verifica se o número de conta tem exatamente 8 dígitos:
    private static void verificarNumeroConta(String numeroConta) {
        // Verificação se o número da conta tem exatamente 8 dígitos:
        if (numeroConta.length() != 8) {
            // Lançamento de uma exceção do tipo IllegalArgumentException, caso o número de conta não tenha 8 dígitos:
            throw new IllegalArgumentException("O número de conta deve ter exatamente 8 dígitos.");
        }
    }
}



