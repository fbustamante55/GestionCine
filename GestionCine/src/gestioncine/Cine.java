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

public class Cine implements GestionCineInterfaz {
    private Pelicula[] peliculas;
    private int cantidadPeliculas;

    public Cine() {
        peliculas = new Pelicula[10];
        cantidadPeliculas = 0;
    }

    @Override
    public void agregarPelicula(Pelicula pelicula) {
        if (cantidadPeliculas < peliculas.length) {
            peliculas[cantidadPeliculas] = pelicula;
            cantidadPeliculas++;
            JOptionPane.showMessageDialog(null, "Película agregada: " + pelicula.getTitulo());
        } else {
            JOptionPane.showMessageDialog(null, "No se pueden agregar más películas.");
        }
    }

    @Override
    public double calcularTotalIngresos() {
        double total = 0;
        for (int i = 0; i < cantidadPeliculas; i++) {
            total += peliculas[i].calcularPrecio();
        }
        return total;
    }

    public void mostrarPeliculas() {
        String mensaje = "Lista de Películas:\n";
        for (int i = 0; i < cantidadPeliculas; i++) {
            mensaje += peliculas[i].getTitulo() + " - Precio: " + peliculas[i].calcularPrecio() + "\n";
        }
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
