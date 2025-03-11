public abstract class Inmueble {
    private final String id;
    private final double area;
    private final String direccion;
    private  double valorCompra;

    public Inmueble(String id, double area, String direccion) {
        this.id = id;
        this.area = area;
        this.direccion = direccion;

    }
    public String getId(){
        return this.id;
    }

    public double getArea(){
        return this.area;
    }
    public String getDireccion(){
        return this.direccion;
    }
    public void setValorCompra(double valor){
        this.valorCompra=valor;
    }
    public double getValorCompra(){
        return this.valorCompra;
    }
    public void mostrarInformacion() {
        System.out.println("ID: " + id);
        System.out.println("Área: " + area + " m²");
        System.out.println("Dirección: " + direccion);
    }
}
