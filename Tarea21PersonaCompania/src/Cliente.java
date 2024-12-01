public class Cliente extends Persona {
    private int clienteId;

    public Cliente(String nomnbre, String apellido, String numeroFiscal,
                   String direccion, int clienteId) {
        super(nomnbre, apellido, numeroFiscal, direccion);
        this.clienteId = clienteId;
    }

    public int getClienteId() {
        return clienteId;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\n, clienteId: " + clienteId;
    }
}
