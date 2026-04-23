public class Cliente {
    private String dni;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;

    public Cliente(String dni, String nombre, String apellido, String telefono, String email) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
    }

    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }
}
