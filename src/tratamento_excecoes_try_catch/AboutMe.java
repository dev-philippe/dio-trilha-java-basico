package tratamento_excecoes_try_catch;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        try {

            Scanner teclado = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome ");
            String nome = teclado.next();

            System.out.println("Digite seu sobrenome ");
            String sobrenome = teclado.next();

            System.out.println("Digite sua idade ");
            int idade = teclado.nextInt();

            System.out.println("Digite sua altura ");
            double altura = teclado.nextDouble();

            //imprimindo os dados obtidos pelo usuário
            System.out.println("Ola, me chamo " + nome.toLowerCase() + " " + sobrenome);
            System.out.println("tenho " + idade + " anos ");
            System.out.println("Minha altura é " + altura + " cm ");

            teclado.close();
        }catch (InputMismatchException e){
            System.out.println("Os campos idade altura precisam ser númericos");
        }


    }
}
