public class EjemploCompania {
    public static void main(String[] args) {

        Empleado juan = new Empleado("Juan", "Ruiz", "127",
                "Fernandez Vallejo, 13", 1117.05, 1);
        System.out.println("Mostrando detalle empleado: ");
        System.out.println(juan);

        Gerente pedro = new Gerente("Pedro", "Gómez", "128",
                "Calle la iglesia, 6", 1600, 2, 10000);
        System.out.println("\nMostrando detalle gerente: ");
        System.out.println(pedro);

        Cliente elisa = new Cliente("Elisa", "González", "50",
                "Calle alta, 415", 1);
        System.out.println("\nMostrando detalle cliente: ");
        System.out.println(elisa);
    }
}
