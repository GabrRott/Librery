
package libro;

import java.util.Scanner;
import libro.datos.LibroDatos;


public class Libro {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese los datos del libro: ISBN, título, Autor y Nº de paginas");
        
        LibroDatos Book1 = new LibroDatos(leer.nextLine(), leer.nextLine(), leer.nextLine(), leer.nextInt());
        System.out.println(Book1);
    }
    
}
