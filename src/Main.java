public class Main {
    public static void main(String[] args) {

        Voador aviao = new Aviao("Boeing", "A320",
                120, 0.6f);

        Voador passaro = new Passaro("Pardal",
                "Passer domesticus", 50);

        aviao.voar();
        passaro.voar();

    }
}