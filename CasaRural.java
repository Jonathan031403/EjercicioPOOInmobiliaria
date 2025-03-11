public class CasaRural extends Casa {
    private final double distanciaCabecera;
    private final double altitud;

    public CasaRural(String id, double area, String direccion, int habitaciones, int banos, int cantidadPisos, double distanciaCabecera, double altitud) {
        super(id, area, direccion, habitaciones, banos, cantidadPisos);
        this.distanciaCabecera = distanciaCabecera;
        this.altitud = altitud;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Distancia a cabecera municipal: " + distanciaCabecera + " km");
        System.out.println("Altitud sobre el nivel del mar: " + altitud + " m");
    }
}