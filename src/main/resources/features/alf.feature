Feature: Search

    Scenario: Searching for ALF film
        Given que el usuario navega a la página principal de TMDB
        When busca la serie "ALF"
        And accede a la página de detalles del show
        Then debería ver que el creador es "Paul Fusco"
        And que hay al menos 4 temporadas
        Then toma una captura de pantalla del resultado