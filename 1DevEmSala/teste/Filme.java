/*Fazer o nome do arquivo com o mesmo nome da classe, e o nome da classe é com primeira letra maiuscula*/
package teste;

class Filme {
    String nome;
    String genero;
    int estoque;
    int duracao;

    void alugar() {
        System.out.println("Filme Alugado");
    }

    void devolver() {
        System.out.println("Filme devolvido");
    }
}