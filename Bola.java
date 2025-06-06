public class Bola {

    private String cor;
    private double circunferencia;
    private String material;


    public Bola(String cor, double circunferencia, String material) {
        this.cor = cor;
        this.circunferencia = circunferencia;
        this.material = material;
    }


    public void trocaCor(String novaCor) {
        this.cor = novaCor;
    }


    public void mostraCor() {
        System.out.println("A cor da bola é: " + this.cor);
    }


    public double getCircunferencia() {
        return circunferencia;
    }

    public String getMaterial() {
        return material;
    }
}
