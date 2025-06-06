public class Retangulo {

    private double base;
    private double altura;


    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }


    public void mudarLados(double novaBase, double novaAltura) {
        this.base = novaBase;
        this.altura = novaAltura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }


    public double calcularArea() {
        return base * altura;
    }


    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
}
