package teste;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        Filme filme1 = new Filme();

        cliente1.nome = "junin";
        cliente1.idade = 18;

        filme1.nome = "Algum Filme";
        filme1.estoque = 3;

        cliente1.alugarFilme(filme1);
    }
}
