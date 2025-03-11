public class Local extends Inmueble {
    private final String localizacion;

    public Local(String id, double area, String direccion, String localizacion) {
        super(id, area, direccion);
        this.localizacion = localizacion;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Localización: " + localizacion);
    }
}