public abstract class Apartamento extends InmuebleVivienda {
    private final double valorAdministracion;

    public Apartamento(String id, double area, String direccion, int habitaciones, int banos, double valorAdministracion) {
        super(id, area, direccion, habitaciones, banos);
        this.valorAdministracion = valorAdministracion;
    }

    public double getValorAdministracion() {
        return valorAdministracion;
    }
}