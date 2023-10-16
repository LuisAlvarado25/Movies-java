package com.methaporce.vista;


import com.methaporce.controller.GestorPelicula;
import com.methaporce.model.Pelicula;

public class Main {

    public static void main(String[] args) {
        // Crear instancias de películas
        Pelicula pelicula1 = new Pelicula(1, "Pelicula 1", true);
        Pelicula pelicula2 = new Pelicula(2, "Pelicula 2", false);
        Pelicula pelicula3 = new Pelicula(3, "Pelicula 3", true);

        // Crear un gestor de películas
        GestorPelicula gestor = new GestorPelicula();

        // Agregar películas al gestor
        gestor.AgregarPelicula(pelicula1);
        gestor.AgregarPelicula(pelicula2);
        gestor.AgregarPelicula(pelicula3);
        gestor.ObtenerPeliculas();
        System.out.println("Todas las peliculas" + gestor.ObtenerPeliculas());
        // Eliminar una película
        gestor.EliminarPelicula(1);
        System.out.println("Se elimino Pelicula 1"+ gestor.ObtenerPeliculas());
        System.out.println("Peliculas Disponibles" + gestor.ObtenerPeliculasDisponibles());
        System.out.println("Peliculas No Disponibles" + gestor.ObtenerPeliculasNoDisponibles());
        gestor.MarcarPeliculaComoDisponible(2);
        System.out.println("Peliculas 2 ya disponible" + gestor.ObtenerPeliculasNoDisponibles());
        System.out.println("Peliculas Disponibles" + gestor.ObtenerPeliculasDisponibles());


        }
    }

