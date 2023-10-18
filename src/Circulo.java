public class Circulo implements FormaGeometrica{

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return FormaGeometrica.PI*Math.pow(raio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 2*FormaGeometrica.PI*raio;
    }
}
