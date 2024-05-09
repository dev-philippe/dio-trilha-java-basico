package desafio_controle_fluxo;

import java.util.Scanner;

public class contador {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = teclado.nextInt();

        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = teclado.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }
    static  void contar(int parametroUm,int parametroDois) throws ParametrosInvalidosException{
        if(parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro ");
        }

            for(int i = parametroUm; i <= parametroDois; i++){
                System.out.println(i);

            }
        }
    }



