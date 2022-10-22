/**
 * @author Daw120
 */
package com.solomongo.ejercicio2;
public class Libro {
    
    public String ISBN;
    public String titulo;
    public String autor;
    
    Libro(){}
     
     public Libro(String ISBN, String titulo, String autor){  
        this.ISBN=ISBN;  
        this.titulo=titulo; 
        this.autor=autor; 
      } 
         
     public String getISBN(){
        return ISBN;
        }
     public String getTitulo(){
        return titulo;
        }
     public String getAutor(){
        return autor;
        }
  
        public void setISBN(String ISBN) {
        this.ISBN=ISBN; 
        }
        public void setTitulo(String titulo) {
        this.titulo=titulo; 
        }
        public void setAutor(String autor) {
        this.autor=autor;
        }
     
       public void esEspanol(){          
       }
         
       public void mostrar(){    
        }    
  
     public static String
     removeFirst(String str)
     {
        str = str.substring(1, str.length() );
        return str;
     }

   
     
}
