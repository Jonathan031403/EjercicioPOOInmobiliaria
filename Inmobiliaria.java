public class Inmobiliaria implements OperacionesInmobiliarias {
    private final GestorInmuebles gestor;

    public Inmobiliaria(GestorInmuebles gestor) {
        this.gestor = gestor;
    }

    @Override
    public void comprarInmueble(Inmueble inmueble) {
        if (inmueble.getArea()<=100.0){
            inmueble.setValorCompra(200000000.0);
        }else {
            inmueble.setValorCompra(300000000.0);
        }
        gestor.agregarInmueble(inmueble);
        System.out.println("Inmueble comprado: " + inmueble.getId() + " por un valor de: $" + inmueble.getValorCompra() + " el inmueble se encuentra ubicado en la dirección: " + inmueble.getDireccion());
    }

    @Override
    public void venderInmueble(String id) {
        Inmueble inmueble = gestor.buscarInmueble(id);
        if (gestor.buscarInmueble(id) != null) {
            gestor.eliminarInmueble(id);
            System.out.println("Inmueble vendido: " + id + " el inmueble se encuentra ubicado en la dirección: " + inmueble.getDireccion());
        } else {
            System.out.println("Error: Inmueble no encontrado");
        }
    }

    @Override
    public void arrendarInmueble(String id) {
        Inmueble inmueble = gestor.buscarInmueble(id);
        if (inmueble != null) {
            System.out.println("Inmueble arrendado: " + id + " el inmueble se encuentra ubicado en la dirección: " + inmueble.getDireccion());
        } else {
            System.out.println("Error: Inmueble no encontrado");
        }
    }

}
