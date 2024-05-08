package dio_debbunging;

import java.util.Scanner;

public class CalculadoraDeMedias {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String[] alunos = {"Camila", "Lucas", "Bruna","Pedro"};

        double media = calcularMediaDaTurma(alunos , teclado);

        System.out.printf("Media da turma %.1f", media);

    }

    static double calcularMediaDaTurma(String[] alunos, Scanner scanner) {
        double soma = 0;
        for(String aluno : alunos) {
            System.out.printf("Nota do aluno %s: ", aluno);
            double nota = scanner.nextDouble();
            soma += nota;
        }

        return soma / alunos.length;
    }
}
