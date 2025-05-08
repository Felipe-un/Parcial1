package bibliotecauniversitaria;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 * 
 * Implemente un simulador de operaciones basicas de una biblioteca 
 * universitaria, diseñando e implementando las clases u conceptos vistos en 
 * clase (encapsulamiento, instanciación, atributos, objetos, etc.).
 * 
 *  Debe tener:
 *  * Registro de nuevos libros Minimo 3 categorias de libros
 *  * Registro de nuevos usuarios (estudiantes/docentes)
 * 
 * 
 */
public class BibliotecaUniversitaria {
    
    public static void main(String[] args) {
        
        
        // Inicia la clase Scanner
        Scanner lector = new Scanner(System.in);
        lector.useLocale(Locale.US);
        lector.useDelimiter("\n");
        
        // Libros y usuarios
        Libros[] libros = new Libros[10];
        Usuarios[] usuarios = new Usuarios[10];
        int numLibros = 0, numUsuarios = 0;
        
        
        
        while (true) {
            
            System.out.println("BIBLIOTECA UNIVERSITARIA\n");
            System.out.println("1. Registrar libro");
            System.out.println("2. Registrar usuario");
            System.out.println("3. Retirar libro");
            System.out.println("4. Salir");
            System.out.print("Elige una opcion: ");
            int opcion = lector.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.print("Título del libro: ");
                    String titulo = lector.next();
                    libros[numLibros++] = new Libros(titulo);
                    System.out.println("Libro registrado.");
                    break;
                    
                case 2:
                    System.out.print("Nombre del usuario ");
                    String nombre = lector.next();
                    System.out.print("Estudiante o docente?: ");
                    String tipo = lector.next();
                    usuarios[numUsuarios++] = new Usuarios(nombre, tipo);
                    System.out.println("Usuario registrado.");
                    break;
                    
                case 3:
                    System.out.println("Usuarios:");
                    for (int i = 0; i < numUsuarios; i++) {
                        System.out.println(i + ". " + usuarios[i].nombre + " (" + usuarios[i].tipo + ") - Libros prestados: " + usuarios[i].librosPrestados);
                    }   System.out.print("Selecciona el número del usuario: ");
                    int u = lector.nextInt();
                    lector.nextLine();
                    System.out.println("Libros disponibles:");
                    for (int i = 0; i < numLibros; i++) {
                        if (libros[i].disponible) {
                            System.out.println(i + ". " + libros[i].titulo);
                        }
                    }   System.out.print("Selecciona el número del libro: ");
                    int l = lector.nextInt();
                    lector.nextLine();
                    if (!libros[l].disponible) {
                        System.out.println("Ese libro ya fue prestado.");
                    } else {
                        libros[l].disponible = false;
                        usuarios[u].retirarLibro();
                        System.out.println("Libro retirado con éxito.");
                    }   break;
                    
                case 4:
                    System.out.println("Gracias");
                    break;
                    
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
            
            lector.close();
        }
        
        
    }
    

}
    
    

