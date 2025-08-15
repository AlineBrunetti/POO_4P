public class Animal{
    protected String nome;
    protected int peso;

    public Animal(String nome, int peso){
        this.nome = nome;
        this.peso = peso;
    }

    public void falar(){
        System.out.println("Barulho genérico de animal");
    }

    public String toString(){
        return "Nome do animal é: "+ nome + " e ele pesa: "+ peso;
    }

    public String getNome(){
        return this.nome;
    }
    public String getPeso(){
        return this.nome;
    }
}