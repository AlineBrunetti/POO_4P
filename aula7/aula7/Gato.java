public class Gato extends Animal {
    public Gato(String nome, int peso){
        super(nome, peso);
    }

    @Override
    public void falar(){
        System.out.println("miau");
    }
}
