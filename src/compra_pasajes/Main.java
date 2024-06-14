package compra_pasajes;

public class Main {
    public static void main(String[] args) {

        ruta ruta = new ruta("Quito", "Guayaquil", 20.0);
        servicio servicio = new servicio() {
            @Override
            public double CalcularCosto() {
                return 0;
            }
        };
        pasajero pasajero = new pasajero("Maria", 30);


        tickets tickets = new tickets(ruta, servicio, pasajero, 10);


        double costoTotal = tickets.calcularCosto();
        System.out.println("El costo del servicio es: $" + costoTotal);

        tickets.imprimirDatos();
    }
}
