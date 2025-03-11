public class Oficina extends Local {
    private final boolean esGobierno;

    public Oficina(String id, double area, String direccion, String localizacion, boolean esGobierno) {
        super(id, area, direccion, localizacion);
        this.esGobierno = esGobierno;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Es oficina de gobierno: " + (esGobierno ? "Sí" : "No"));
    }
}