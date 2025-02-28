/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestioncine;
import javax.swing.JOptionPane;
/**
 *
 * @author Fabia
 */

public abstract class Pelicula {
    private String titulo;
    private String genero;
    private int duracion;


public Pelicula(String titulo, String genero, int duracion) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
        }   

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    public abstract double calcularPrecio();
    
    public void mostrarInformacion() {
        JOptionPane.showMessageDialog(null, 
            "Título: " + titulo + "\nGénero: " + genero + "\nDuración: " + duracion + " minutos");
    }
}

    



    




