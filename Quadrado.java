public class Quadrado {

    private double lado;


    public Quadrado(double lado) {
        this.lado = lado;
    }


    public void mudarValorLado(double novoLado) {
        this.lado = novoLado;
    }


    public double retornarValorLado() {
        return this.lado;
    }


    public double calcularArea() {
        return this.lado * this.lado;
    }
}
