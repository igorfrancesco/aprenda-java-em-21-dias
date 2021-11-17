package facul3p1.exerc1.calcularimc;

public class Pessoa {
    private String nome;
    private double idade, peso, altura;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @return the idade
     */
    public double getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(double idade) {
        this.idade = idade;
    }

    public double calculaIMC() {
        return peso / (altura * altura);
    }

    public void informaCategoriaIMC() {
        double temp = peso / (altura * altura);

        if (calculaIMC() < 18.5) {
            System.out.println("ABAIXO DO PESO " + temp);
        } else if (calculaIMC() >= 18.5 && calculaIMC() < 25) {
            System.out.println("PESO NORMAL " + temp);
        } else if (calculaIMC() >= 25 && calculaIMC() < 30) {
            System.out.println("SOBREPESO " + temp);
        } else if (calculaIMC() >= 30 && calculaIMC() < 35) {
            System.out.println("OBESIDADE GRAU I!! " + temp);
        } else if (calculaIMC() >= 35 && calculaIMC() < 40) {
            System.out.println("OBESIDADE GRAU II!! " + temp);
        } else if (calculaIMC() >= 40) {
            System.out.println("OBESIDADE GRAU III!!" + temp);
        }

    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
        informaCategoriaIMC();
    }
}
