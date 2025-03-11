import java.util.ArrayList;
import java.util.List;

public class GestorInmuebles {
    private final List<Inmueble> inmuebles;

    public GestorInmuebles() {
        this.inmuebles = new ArrayList<>();
    }

    public void agregarInmueble(Inmueble inmueble) {
        inmuebles.add(inmueble);
    }

    public void eliminarInmueble(String id) {
        inmuebles.removeIf(inmueble -> inmueble.getId().equals(id));
    }

    public Inmueble buscarInmueble(String id) {
        return inmuebles.stream()
                .filter(inmueble -> inmueble.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}