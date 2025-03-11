public class LocalComercial extends Local {
    private final String centroComercial;

    public LocalComercial(String id, double area, String direccion, String localizacion, String centroComercial) {
        super(id, area, direccion, localizacion);
        this.centroComercial = centroComercial;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Centro Comercial: " + centroComercial);
    }
}
