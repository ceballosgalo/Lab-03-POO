public class Posnet {

    public Ticket efectuarPago(TarjetaDeCredito tarjeta, double monto, int cuotas) {
        double montoFinal = monto + calcularRecargo(monto, cuotas);

        if (tarjeta.getSaldoDisponible() >= montoFinal) {
            tarjeta.disminuirSaldo(montoFinal);

            double montoPorCuota = montoFinal / cuotas;

            return new Ticket(
                tarjeta.getTitular().getNombreCompleto(),
                montoFinal,
                montoPorCuota
            );
        }

        return null;
    }

    private double calcularRecargo(double monto, int cuotas) {
        if (cuotas == 1) {
            return 0;
        }
        return monto * 0.03 * (cuotas - 1);
    }
}