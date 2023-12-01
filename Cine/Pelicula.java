package Cine;

import java.text.DecimalFormat;

public class Pelicula {
    private String titulo;
    private int espectadores2022;
    private int salas2022;
    private double gananciaBruta2022;
    double gananciaNeta2022;

    public Pelicula(String titulo, int espectadores2022, int salas2022, double gananciaBruta2022) {
        this.titulo = titulo;
        this.espectadores2022 = espectadores2022;
        this.salas2022 = salas2022;
        this.gananciaBruta2022 = gananciaBruta2022;
        this.gananciaNeta2022 = gananciaBruta2022 * 0.80;
    }

    public void proyectarGanancias2023() {
        int espectadores2023 = espectadores2022 / 2;
        int salas2023 = salas2022 / 2;
        double gananciaBruta2023 = gananciaBruta2022;
        double gananciaNeta2023 = gananciaBruta2023 * 0.80;

        DecimalFormat df = new DecimalFormat("#,###.##");

        System.out.println("Proyección para la película '" + titulo + "' en 2023:");
        System.out.println("Espectadores 2023: " + df.format(espectadores2023));
        System.out.println("Salas 2023: " + salas2023);
        System.out.println("Ganancia Bruta 2023: $" + df.format(gananciaBruta2023));
        System.out.println("Ganancia Neta 2023: $" + df.format(gananciaNeta2023));
        System.out.println();
    }
}