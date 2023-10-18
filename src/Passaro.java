public class Passaro implements Voador {

    private String raca;
    private String nomeCientifico;
    private float intensidadeSom;

    public Passaro(String raca, String nomeCientifico, float intensidadeSom) {
        this.raca = raca;
        this.nomeCientifico = nomeCientifico;
        this.intensidadeSom = intensidadeSom;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getNomeCientifico() {
        return nomeCientifico;
    }

    public void setNomeCientifico(String nomeCientifico) {
        this.nomeCientifico = nomeCientifico;
    }

    public float getIntensidadeSom() {
        return intensidadeSom;
    }

    public void setIntensidadeSom(float intensidadeSom) {
        this.intensidadeSom = intensidadeSom;
    }

    @Override
    public void voar() {
        System.out.println("Bater as asas");
    }

}
