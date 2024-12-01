public class Persona {
    private String nomnbre;
    private String apellido;
    private String numeroFiscal;
    private String direccion;

    public Persona(String nomnbre, String apellido, String numeroFiscal, String direccion) {
        this.nomnbre = nomnbre;
        this.apellido = apellido;
        this.numeroFiscal = numeroFiscal;
        this.direccion = direccion;
    }

    public String getNomnbre() {
        return nomnbre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNumeroFiscal() {
        return numeroFiscal;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return "nombre: " + nomnbre +
                ", apellido: " + apellido +
                ", numeroFiscal: " + numeroFiscal +
                ", direccion: " + direccion;

    }
}
