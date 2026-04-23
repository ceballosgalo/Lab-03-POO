public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente(
            "12345678",
            "Juan",
            "Pérez",
            "1122334455",
            "juan@mail.com"
        );

        TarjetaDeCredito tarjeta = new TarjetaDeCredito(
            "Visa",
            "Banco Nación",
            "1234-5678-9012-3456",
            15000,
            cliente
        );

        Posnet posnet = new Posnet();

        Ticket ticket = posnet.efectuarPago(tarjeta, 10000, 5);

        if (ticket != null) {
            System.out.println(ticket);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}