/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u2hoja8.u2hoja8ej2;

/**
 *
 * @author Eloy
 */
public class Libro {

    private String titulo, autor, ISBN;

    public Libro(String ISBN, String titulo, String autor) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public boolean esEspañol() {
        String posiciones4y5 = ISBN.substring(3, 5);
        String español = "84";
        boolean iguales = español.equalsIgnoreCase(posiciones4y5);
        return iguales;
    }

    public String mostrar() {
        String autorMayus = autor.substring(0, 1);
        autorMayus = autorMayus.toUpperCase();
        String autorMayus2 = autor.substring(1);
        autorMayus2 = autorMayus2.toLowerCase();
        String autorFin = autorMayus.concat(autorMayus2);
        titulo = titulo.toUpperCase();
        String espacio = " ";
        String mostrar = titulo + espacio + autorFin;
        return mostrar;
    }

}
