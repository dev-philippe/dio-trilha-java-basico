package desafio_codigo_dio;

import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {

        //Lê os valores de Entrada:
        Scanner teclado = new Scanner(System.in);
        float valorSalario = teclado.nextFloat();
        float valorBeneficios = teclado.nextFloat();

        float valorImposto = 0;
        if(valorSalario >= 0  && valorSalario <=1100){
            //Atribuiu a oliguota de 5% mediante o sálario:
            valorImposto = 0.05f * valorSalario;
        } else if (valorSalario >= 1100.01 && valorSalario <= 2500.00) {
            valorImposto = 0.10f * valorSalario;
            
        }else {
            valorImposto = 0.15f * valorSalario;
        }
        //Todo Criar as demais condições para as aliquotas de 10.00% e 15.00%.

        //Calcula e imprime a Saída (com 2 casas decimais):
        float saida = valorSalario - valorImposto + valorBeneficios;
        System.out.println(String.format("%.2f",saida));

    }
}
