/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestioncine;

/**
 *
 * @author Fabia
 */
import javax.swing.JOptionPane;

public class GestionCine {
    public static void main(String[] args) {
        Cine cine = new Cine();

        while (true) {
            String opcion = JOptionPane.showInputDialog(
                "Gestión de Cine\n" +
                "1. Agregar película de estreno\n" +
                "2. Agregar película normal\n" +
                "3. Mostrar películas\n" +
                "4. Calcular total de ingresos\n" +
                "5. Salir\n" +
                "Elija una opción:"
            );

            if (opcion == null || opcion.equals("5")) {
                JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                break;
            }

            switch (opcion) {
                case "1":
                    String tituloEstreno = JOptionPane.showInputDialog("Ingrese el título de la película de estreno:");
                    String generoEstreno = JOptionPane.showInputDialog("Ingrese el género:");
                    int duracionEstreno = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la duración en minutos:"));

                    Pelicula peliEstreno = new PeliculaEstreno(tituloEstreno, generoEstreno, duracionEstreno);
                    cine.agregarPelicula(peliEstreno);
                    break;

                case "2":
                    String tituloNormal = JOptionPane.showInputDialog("Ingrese el título de la película normal:");
                    String generoNormal = JOptionPane.showInputDialog("Ingrese el género:");
                    int duracionNormal = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la duración en minutos:"));

                    Pelicula peliNormal = new PeliculaNormal(tituloNormal, generoNormal, duracionNormal);
                    cine.agregarPelicula(peliNormal);
                    break;

                case "3":
                    cine.mostrarPeliculas();
                    break;

                case "4":
                    JOptionPane.showMessageDialog(null, "Total de ingresos: " + cine.calcularTotalIngresos());
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        }
    }
}

