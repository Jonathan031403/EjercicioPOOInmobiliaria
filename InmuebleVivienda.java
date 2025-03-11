public abstract class InmuebleVivienda extends Inmueble {
    private final int habitaciones;
    private final int banos;

    public InmuebleVivienda(String id, double area, String direccion, int habitaciones, int banos) {
        super(id, area, direccion);
        this.habitaciones = habitaciones;
        this.banos = banos;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();  // Llamamos a la versión de Inmueble
        System.out.println("Habitaciones: " + habitaciones);
        System.out.println("Baños: " + banos);
    }
}
