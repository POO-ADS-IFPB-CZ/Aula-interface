public class Aviao implements Voador {

    private String fabricante;
    private String modelo;
    private int capacidade;
    private float combustivel;

    public Aviao(String fabricante, String modelo, int capacidade, float combustivel) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.capacidade = capacidade;
        this.combustivel = combustivel;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public float getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(float combustivel) {
        this.combustivel = combustivel;
    }

    @Override
    public void voar() {
        System.out.println("Ligar o motor");
    }
}
