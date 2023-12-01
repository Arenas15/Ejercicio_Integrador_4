pipeline {
    agent any

    stages {
        stage('Proyección de Películas del 2023') {
            steps {
                script {
                    def peliculas2023 = [
                        ['Avatar', 50000, 5000, 1_000_000_000, 800_000_000],
                        ['Avengers: Endgame', 45000, 4500, 810_000_000, 648_000_000],
                        ['Avatar: The Way of Water', 80000, 8000, 640000000],
                        ['Titanic', 70000, 7000, 490000000],
                        ['Star Wars: Episode VII - The Force Awakens", 60000, 6000, 360000000],
                        ['Avengers: Infinity War', 50000, 5000, 250000000],
                        ['Spider-Man: No Way Home', 40000, 4000, 160000000],
                        ['Jurassic World', 30000, 3000, 90000000],
                        ['The Lion King', 20000, 2000, 40000000],
                        ['The Avengers', 10000, 1000, 10000000]
                    ]

                    echo 'Proyecciones de películas para 2023:'
                    echo '-----------------------------------'

                    peliculas2023.each { pelicula ->
                        def titulo = pelicula[0]
                        def espectadores = pelicula[1]
                        def salas = pelicula[2]
                        def gananciaBruta = pelicula[3]
                        def gananciaNeta = pelicula[4]

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
