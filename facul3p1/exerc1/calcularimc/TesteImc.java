package facul3p1.exerc1.calcularimc;

public class TesteImc {

    public static void main(String[] args) {

        var pessoa = new Pessoa();

        pessoa.setNome("IGOR");
        pessoa.setIdade(29);
        pessoa.setPeso(70);
        pessoa.setAltura(1.77);

        pessoa.calculaIMC();
        pessoa.mostrarInformacoes();

    }
}