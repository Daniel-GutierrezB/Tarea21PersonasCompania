public class Gerente extends Empleado{
    private double presupuesto;

    public Gerente(String nomnbre, String apellido, String numeroFiscal,
                   String direccion, double remuneracion, int empleadoId,
                   double presupuesto) {
        super(nomnbre, apellido, numeroFiscal, direccion, remuneracion, empleadoId);
        this.presupuesto = presupuesto;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\n, presupuesto: " + presupuesto + "€";
    }
}
