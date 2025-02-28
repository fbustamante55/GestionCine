/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestioncine;

/**
 *
 * @author Fabia
 */
import javax.swing.JOptionPane;

public class PeliculaNormal extends Pelicula {
    private static final double PRECIO_BASE = 3000.0; 

    public PeliculaNormal(String titulo, String genero, int duracion) {
        super(titulo, genero, duracion);
    }

    @Override
    public double calcularPrecio() {
        return PRECIO_BASE;
    }

    public void mostrarPrecio() {
        JOptionPane.showMessageDialog(null, "Precio de película normal: " + calcularPrecio());
    }
}
