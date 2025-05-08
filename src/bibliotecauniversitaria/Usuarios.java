package bibliotecauniversitaria;
/**
 *
 * @author Estudiante
 */
public class Usuarios {
    
    String nombre;
    String tipo;
    int librosPrestados = 0;

    Usuarios(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    void retirarLibro() {
        librosPrestados++;
    }
}
