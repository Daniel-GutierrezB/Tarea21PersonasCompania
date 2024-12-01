public class Empleado extends Persona{
    private double remuneracion;
    private int empleadoId;

    public Empleado(String nomnbre, String apellido, String numeroFiscal, String direccion
                    , double remuneracion, int empleadoId) {
        super(nomnbre, apellido, numeroFiscal, direccion);
        this.remuneracion = remuneracion;
        this.empleadoId = empleadoId;
    }

    public void aumentarRemuneracion(int porcentaje){
        this.remuneracion = (this.remuneracion*porcentaje/100) + this.remuneracion;
    }

    public double getRemuneracion() {
        return remuneracion;
    }

    public int getEmpleadoId() {
        return empleadoId;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\n, empleadoId: " + empleadoId
                + ", remuneracion: " + remuneracion + "€";
    }
}
