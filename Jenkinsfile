pipeline {
    agent any

    stages {
        stage('Preparación de Datos') {
            steps {
                script {
                    def peliculas2022 = [
                        ['Avatar', 100000, 10000, 1_000_000_000, 800_000_000],
                        ['Avengers: Endgame', 90000, 9000, 810_000_000, 648_000_000],
                        ['Avatar: The Way of Water', 80000, 8000, 640_000_000, 512_000_000],
                        ['Titanic', 70000, 7000, 490_000_000, 392_000_000],
                        ['Star Wars: Episode VII - The Force Awakens', 60000, 6000, 360_000_000, 288_000_000],
                        ['Avengers: Infinity War', 50000, 5000, 250_000_000, 200_000_000],
                        ['Spider-Man: No Way Home', 40000, 4000, 160_000_000, 128_000_000],
                        ['Jurassic World', 30000, 3000, 90_000_000, 72_000_000],
                        ['The Lion King', 20000, 2000, 40_000_000, 32_000_000],
                        ['The Avengers', 10000, 1000, 10_000_000, 8_000_000]
                    ]

                    def peliculas2023 = [:]

                    peliculas2022.each { pelicula ->
                        def titulo = pelicula[0]
                        def espectadores2022 = pelicula[1]
                        def salas2022 = pelicula[2]
                        def gananciaBruta2022 = pelicula[3]

                        def espectadores2023 = espectadores2022 / 2
                        def salas2023 = salas2022 / 2
                        def gananciaBruta2023 = gananciaBruta2022
                        def gananciaNeta2023 = gananciaBruta2023 * 0.80

                        peliculas2023[titulo] = [espectadores2023, salas2023, gananciaBruta2023, gananciaNeta2023]
                    }

                    env.PELICULAS_2023 = peliculas2023
                }
            }
        }

        stage('Proyección Películas 2023') {
            steps {
                script {
                    echo 'Proyecciones de películas para 2023:'
                    echo '-----------------------------------'

                    env.PELICULAS_2023.each { titulo, datos ->
                        def espectadores = datos[0]
                        def salas = datos[1]
                        def gananciaBruta = datos[2]
                        def gananciaNeta = datos[3]

                        echo "Título: ${titulo}"
                        echo "Espectadores 2023: ${espectadores}"
                        echo "Salas 2023: ${salas}"
                        echo "Ganancia Bruta 2023: $${gananciaBruta}"
                        echo "Ganancia Neta 2023: $${gananciaNeta}"
                        echo '-----------------------------------'
                    }
                }
            }
        }
    }
}
