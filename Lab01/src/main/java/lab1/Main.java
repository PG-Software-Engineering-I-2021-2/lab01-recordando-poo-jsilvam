package lab1;

public class Main {
    public static void main(String[] args) {
        test(0.9);
    }

    public static boolean test( double consumo) {
        try {
            
        Automovil auto = new Automovil(100, 10, consumo);
        auto.abastecer(90);
        auto.abastecer(100);
        auto.viajar(4);

        Camion camion = new Camion(100, 10, consumo);
        camion.abastecer(90);
        camion.abastecer(100);
        camion.viajar(12);

        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
