public class Cachorro extends Animal {
    public Cachorro(String nome, int peso){
        super(nome, peso);
    }
    
    @Override
    public void falar(){
        System.out.println("auau");
    }

    @Override
    public String toString(){
        return "Nome do dog é: "+ nome + "e ele pesa: "+ peso;
    }
}
