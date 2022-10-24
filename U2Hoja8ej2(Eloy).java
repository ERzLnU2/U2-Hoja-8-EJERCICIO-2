/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package u2hoja8.u2hoja8ej2;

/**
 *
 * @author Eloy
 */
public class U2Hoja8ej2 {

    public static void main(String[] args) {
        Libro libro1 = new Libro("9788499640884", "historia", "eloy");

        System.out.println("Titulo y Autor:" + libro1.mostrar());
        System.out.println("Español? " + libro1.esEspañol());
    }
}
