package Cine;

public class Main {
    public static void main(String[] args) {
        Pelicula[] peliculas = {
            new Pelicula("Avatar", 100000, 10000, 1000000000),
            new Pelicula("Avengers: Endgame", 90000, 9000, 810000000),
            new Pelicula("Avatar: The Way of Water", 80000, 8000, 640000000),
            new Pelicula("Titanic", 70000, 7000, 490000000),
            new Pelicula("Star Wars: Episode VII - The Force Awakens", 60000, 6000, 360000000),
            new Pelicula("Avengers: Infinity War", 50000, 5000, 250000000),
            new Pelicula("Spider-Man: No Way Home", 40000, 4000, 160000000),
            new Pelicula("Jurassic World", 30000, 3000, 90000000),
            new Pelicula("The Lion King", 20000, 2000, 40000000),
            new Pelicula("The Avengers", 10000, 1000, 10000000)
        };

        for (Pelicula pelicula : peliculas) {
            pelicula.proyectarGanancias2023();
        }
    }
}
