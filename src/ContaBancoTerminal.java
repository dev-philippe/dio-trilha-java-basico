import java.util.Scanner;

public class ContaBancoTerminal {
    public static void main(String[] args) {

        //TODO: Conhecer e importar a classe Scanner


        // Exibir as mensagens para o nosso usuário

        // Obter pelo Scanner os valores  digitados no terminal

        // Exibir a mensagem da conta criada

        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor digite o numero da conta: ");
        int numConta = teclado.nextInt();

        System.out.println("Por favor digite o numero da sua agência: ");
        int NumAgencia = teclado.nextInt();

        System.out.println("Por favor digite seu nome: ");
        String nomeCliente = teclado.next();

        System.out.println("Por favor Digite seu saldo: ");
        double saldo = teclado.nextDouble();

        System.out.println("Ola " + nomeCliente + ",obrigado por criar uma conta em nosso banco,sua agência " + NumAgencia +
                ",sua conta é " + numConta + " seu saldo " + saldo + " ja esta disponivel para saque.");


    }
}