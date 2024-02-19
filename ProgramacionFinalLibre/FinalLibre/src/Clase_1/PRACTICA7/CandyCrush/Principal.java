package CandyCrush;
/*4 - 
Se desea implementar el control de tableros de un juego de Golosinas (similar al Candy
Crush). Cada ficha del tablero posee una fortaleza (golpes necesarios para destruirla), ocupa
un espacio del tablero (medido en cantidad de casilleros), y tiene un poder de destrucción.
Por ejemplo el “chocolate” tiene una fortaleza de 1, ocupa 1 casillero del tablero y tiene
poder de destrucción 0; la “piedra” tiene fortaleza 6, ocupa 1 casillero de tablero y tiene
poder de destrucción 0; el “caramelo a rayas” ocupa 1 casillero del tablero, tiene fortaleza 1,
y un poder de destrucción de 10; la “torta” ocupa 4 casilleros, tiene fortaleza 8 y poder de
destrucción 4, y así con cada una de las distintas fichas. También existen fichas especiales
cuyo poder de destrucción se calcula como la fortaleza de la ficha, dividido el espacio que
ocupan.
Un tablero posee un puntaje mínimo que es necesario alcanzar para pasar al siguiente
nivel, una lista de fichas, la dificultad del mismo (se calcula como la sumatoria de todas las
fortalezas de las fichas, dividido la sumatoria del poder de destrucción de todas las fichas).
Programación 2
Tecnicatura Universitaria en Desarrollo de Aplicaciones Informáticas
Práctica Nº 7 – 2023
En cada tablero, se debe poder buscar:
● Todas las fichas que posean un poder de destrucción mayor a 2
● Todas las fichas que ocupen más de 4 lugares
● Todas las fichas que tengan una fortaleza mayor a 5
● Combinaciones lógicas de los anteriores
5 - Streaming
Una plataforma de streaming de video permite a sus usuarios consultar su catálogo de
películas disponibles. De cada película se guarda el título, la sinopsis, los géneros (“acción”,
“terror”, “drama”, etc), el director, los actores, el año de estreno, la duración de la película
(en minutos), y la edad mínima requerida para ver la película.
La plataforma debe permitir realizar búsquedas de películas según diversos criterios, por
ejemplo:
● Buscar todas las películas que en el título contenga la palabra “luna”.
● Buscar todas las películas que contengan un género específico (por ejemplo,
“terror”).
● Buscar todas las películas en las que haya actuado Will Smith y cuyo director
NO haya sido Martin Scorsese.
● Buscar todas las películas que se hayan grabado antes del 2015 y cuya
duración sea menor a 95 minutos.
A su vez, dado que algunas películas son más exitosas que otras, a la hora de analizar si
adquirir la licencia de una nueva película, la plataforma analiza si la película resultará
rentable o no. Una película será rentable si cumple con ciertos criterios que hace que los
usuarios prefieran verla. Por ejemplo, el CEO de la plataforma observó que los usuarios
suelen ver:
● Películas cuya duración sea menor a 120 minutos, que no sean del género
“comedia”.
● Películas posteriores del 2017, a no ser que se trate de películas del género
“infantil” o “documental”.
Dado que las preferencias de los clientes cambian con el tiempo, el CEO de la plataforma de
streaming desea poder cambiar en tiempo de ejecución las políticas de adquisición de
licencias de películas, en caso de ser necesario. Proveer un servicio que le permita a la
plataforma determinar si una película resultará rentable o no.
 */

public class Principal {
    
}
