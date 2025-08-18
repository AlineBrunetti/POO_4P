public class Circulo extends Forma {
    private double raio;

    public Circulo(String nome, double raio) {
        super(nome, "π * raio²"); // subclasse passa a fórmula
        this.raio = raio;
    }

    @Override
    public double area() {
        return Math.PI * raio * raio;
    }

    @Override
    public String toString() {
        return "Círculo: " + nome + " | Fórmula: " + formula + " | Área = " + area();
    }
}
