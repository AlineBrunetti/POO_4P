/*public class TestaAnimal {
    public static void main(String[] args) {
        Animal a1 = new Animal("pink", 3);
        Animal a2 = new Cachorro("au", 20); //upcasting
        Animal a3 = new Gato("meau", 15); //upcasting

        a1.falar();
        a2.falar();
        a3.falar();
    }
}*/

import java.util.ArrayList;

public class TestaAnimal {
    public static void main(String[] args) {
        ArrayList<Animal> animais = new ArrayList<>();
        
        animais.add(new Animal("bartolomeu",20));
        animais.add(new Cachorro("ARTHUR",20));
        animais.add(new Gato("ROBSOM",20));

        for (Animal animal : animais){
            animal.falar();
            System.out.println(animal);
        }
    }
}