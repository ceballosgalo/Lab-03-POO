public class Ticket {
    private String nombreCompleto;
    private double montoTotal;
    private double montoPorCuota;

    public Ticket(String nombreCompleto, double montoTotal, double montoPorCuota) {
        this.nombreCompleto = nombreCompleto;
        this.montoTotal = montoTotal;
        this.montoPorCuota = montoPorCuota;
    }

    @Override
    public String toString() {
        return "Cliente: " + nombreCompleto +
               "\nTotal a pagar: $" + montoTotal +
               "\nMonto por cuota: $" + montoPorCuota;
    }
}