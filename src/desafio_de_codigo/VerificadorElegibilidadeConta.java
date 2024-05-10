package desafio_de_codigo;

import java.util.Scanner;

// Aqui é definido uma classe chamada VerificadorElegibilidadeConta:
public class VerificadorElegibilidadeConta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();


        // Verificando se a idade é maior ou igual a 18 e imprimindo uma mensagem
        if (idade >= 18) {
            System.out.println("Você é elegível para criar uma conta bancária.");
        } else {
            System.out.println("Você não é elegível para criar uma conta bancária.");
        }

        // Fechamos o objeto Scanner para liberar os recursos:
        scanner.close();
    }
}
