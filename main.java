/**
 * @author Daw120
 * 
 * 2.- Diseña una clase llamada Libro con los atributos privados: ISBN, titulo y autor y los métodos:
 
• Un constructor que inicializa las propiedades con los valores pasados como argumentos.
• Métodos selectores y modificadores.
• Un método llamado esEspanol que devuelve verdadero si los caracteres que ocupan las posiciones 4
  y 5 del ISBN son“84”. Ejemplo de ISBN=”9788499640884” es un libro editado en España.
• Un método llamado mostrar que muestra el título con todas las letras en mayúsculas y el autor 
  en minúsculas (salvo la primera letra).

Desde el método main() crear un objeto de tipo Libro mostrar todos sus datos y decir si es español o no.
 */
package com.solomongo.ejercicio2;
import static com.solomongo.ejercicio2.Libro.removeFirst;
public class Ejercicio2 {
    public static void main(String[] args) {
        Libro boko=new Libro(); 
 boko.setTitulo("holaMundo");
 boko.setAutor("Guillermux"); 
 boko.setISBN("9788499640884"); 
 System.out.print("\nTitulo: "); System.out.print(boko.getTitulo());
 System.out.print("\nAutor: "); System.out.print(boko.getAutor());
 System.out.print("\nISBN: "); System.out.print(boko.getISBN());
 
 String cuenta = boko.getISBN();
 char cuarta=cuenta.charAt(3);
 char quinta=cuenta.charAt(4);
 System.out.print("\n\nCuarta letra: "+cuarta);
 System.out.print(", quinta: "+quinta);
 boolean español =cuarta=='8' && quinta=='4';
Boolean miBoolean = español;
System.out.print("\nEs Espanol el libro?: "+español);


System.out.print("\n\n"+boko.getTitulo().toUpperCase()+", ");
char charAt = boko.getAutor().toUpperCase().charAt(0);
System.out.print(charAt);
String str = boko.getAutor();
System.out.print(removeFirst(str).toLowerCase()+"\n\n");

    }
}
