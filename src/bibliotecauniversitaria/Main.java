package bibliotecauniversitaria;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Main {
    
    public void Categorias(String ciencia, String literatura, String ingenieria){
        
        System.out.println("Elija la categoria que prefiera: ");
        System.out.println("1. Ciencia");
        System.out.println("2. Licenciatura");
        System.out.println("3. Ingenieria");
    
    }
    
    public static void main(String[] args) {
        
        // Inicializa la libreria Scanner
        Scanner lector = new Scanner(System.in);
        lector.useLocale(Locale.US);
        lector.useDelimiter("\n");
        
        // Variables
        String nombreDeUsuario;         
        int tipoDeUsuario;
        
        
        // Para agregar libros
        Libros[] libros = new Libros[10];
        int numLibros = 0;
           
        

        // Ingresa el nombre del usuario
        System.out.println("Ingrese su nombre");
        nombreDeUsuario = lector.next();
        
        System.out.println("Bienvenido " + nombreDeUsuario);
        
        
        // Clasifica si es estudiante o docente
        System.out.println("Accede como estudiante o como docente?");
        System.out.println("1. Estudiante");
        System.out.println("2. Docente");
        tipoDeUsuario = lector.nextInt();
        
        
        // Deacuerdo a lo especificado por el usuario dara una u otra opcion
        switch (tipoDeUsuario) {
            
            case 1:
                System.out.println("Como 'ESTUDIANTE' tiene derecho a retirar hasta 3 libros");
                        System.out.print("Título del libro: ");
                        String titulo = lector.nextLine();
                        libros[numLibros++] = new Libros(titulo);
                        System.out.println("Libro registrado.");
                
                
                break;
            case 2:
                System.out.println("Como 'DOCENTE' tiene derecho a retirar hasta 5 libros");
                
                
                break;
            default:
                System.out.println("Opcion invalida!");
        }
        
        
        
        
        
    }
    
}
