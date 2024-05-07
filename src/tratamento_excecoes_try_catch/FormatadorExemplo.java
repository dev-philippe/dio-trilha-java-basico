package tratamento_excecoes_try_catch;

public class FormatadorExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("2376506");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O cep não coresponde com a regras de negócio");
        }

    }
    static String formatarCep(String cep) throws CepInvalidoException {
        if(cep.length() != 8)
            throw new CepInvalidoException();

        // Simulando um cep formatado
        return "23.765-064";
    }
}
