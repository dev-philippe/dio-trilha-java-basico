package controle_fluxo;

public class CaixaEletronicoSantander {
    public static void main(String[] args) {
        double saldo = 25.0;
        double ValorSocilicitado = 22.0;

        if(ValorSocilicitado < saldo) {
            saldo = saldo - ValorSocilicitado;
            System.out.println("Novo saldo " + saldo);

        }else
            System.out.println("Saldo insulficiente");


    }
}
