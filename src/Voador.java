import java.io.Serializable;

public interface Voador{
    int TESTE = 10;
    default void voar(){
        System.out.println("Estou voando...");
    }

}