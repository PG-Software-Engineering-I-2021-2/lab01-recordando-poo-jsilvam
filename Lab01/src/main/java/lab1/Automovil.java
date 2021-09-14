package lab1;

public class Automovil extends Vehiculo{
    public Automovil(double capacidadCombustible, double cantidadCombustible, double consumoPorKilometro) {
      super(capacidadCombustible, cantidadCombustible, consumoPorKilometro);
    }

    @Override
    public String abastecer(double combustible) {
        if (combustible + this.cantidadCombustible <= this.capacidadCombustible) {
            super.abastecer(combustible);
            return "La cantidad de combustible del automóvil es: " + String.format("%.2f", this.cantidadCombustible);
        } else {
            return "Automóvil no se puede reabastecer el tanque, está lleno.";
        }
    }
}
