public class Main {
    public static void main(String[] args) {
        GestorInmuebles gestor = new GestorInmuebles();
        Inmobiliaria inmobiliaria = new Inmobiliaria(gestor);

        Inmueble localComercial = new LocalComercial("LC1", 100.0, "Avenida Principal 50", "Externo", "Mall Central");
        Inmueble localComercial1 = new LocalComercial("LC2", 300.0, "Avenida Principal 60", "Externo", "Mall Central");
        Inmueble oficina = new Oficina("OF1", 80.0, "Calle de Oficinas 10", "Interno", true);

        inmobiliaria.comprarInmueble(localComercial);
        inmobiliaria.comprarInmueble(localComercial1);
        inmobiliaria.comprarInmueble(oficina);

    }
}