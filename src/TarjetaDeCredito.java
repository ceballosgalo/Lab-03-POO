public class TarjetaDeCredito {
    private String entidadFinanciera;
    private String banco;
    private String numeroTarjeta;
    private double saldoDisponible;
    private Cliente titular;

    public TarjetaDeCredito(String entidadFinanciera, String banco, String numeroTarjeta,
                            double saldoDisponible, Cliente titular) {
        this.entidadFinanciera = entidadFinanciera;
        this.banco = banco;
        this.numeroTarjeta = numeroTarjeta;
        this.saldoDisponible = saldoDisponible;
        this.titular = titular;
    }

    public double getSaldoDisponible() {
        return saldoDisponible;
    }

    public void disminuirSaldo(double monto) {
        this.saldoDisponible -= monto;
    }

    public Cliente getTitular() {
        return titular;
    }
}