public class CasaConjuntoCerrado extends CasaUrbana {
    private final double valorAdministracion;
    private final boolean tieneAreasComunes;

    public CasaConjuntoCerrado(String id, double area, String direccion, int habitaciones, int banos, int cantidadPisos, double valorAdministracion, boolean tieneAreasComunes) {
        super(id, area, direccion, habitaciones, banos, cantidadPisos);
        this.valorAdministracion = valorAdministracion;
        this.tieneAreasComunes = tieneAreasComunes;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Valor administración: " + valorAdministracion);
        System.out.println("Incluye áreas comunes: " + (tieneAreasComunes ? "Sí" : "No"));
    }
}