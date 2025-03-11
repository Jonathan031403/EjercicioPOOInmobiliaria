public abstract class Casa extends InmuebleVivienda {
    private int cantidadPisos;

    public Casa(String id, double area, String direccion, int habitaciones, int banos, int cantidadPisos) {
        super(id, area, direccion, habitaciones, banos);
        this.cantidadPisos = cantidadPisos;
    }

    public int getCantidadPisos() {
        return cantidadPisos;
    }
}