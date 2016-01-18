package sieteYMedia;

import utiles.Teclado;

/**
 * Vamos a codificar el juego de las siete y media con los conocimientos que ya
 * tenemos.
 * 
 * Para su diseño podríamos utilizar:
 * 
 * Enumeraciones para los palos y las figuras (Fíjate al final de este
 * enunciado) Clases para la carta, baraja, partida, jugador... Implementa el
 * método toString() en la medida de lo posible. Ten en cuenta la programación
 * por capas. La comunicación con el usuario se hace a través de la consola.
 * Puedes sobreCargar algunos métodos para la comunicación con el usuario
 * 
 * Recuerda que:
 * 
 * A las siete y media se juega con una baraja española de 40 cartas Supongamos
 * que sólo pueden jugar dos jugadores. Inicialmente, que sólo haya un jugador
 * Al principio del juego se indicará el alias de los jugadores implicados.
 * (opcional) Se podrá averiguar el número de partidas ganadas y perdidas por
 * cada jugador. (opcional) Se podrá mostrar el ranking de las partidas jugadas
 * (opcional)
 * 
 * Para que te plantees el diseño te dejo estas preguntas:
 * 
 * El hecho de pedir una carta, ¿a qué método se refiere? ¿De qué objeto/clase?
 * El hecho de plantarse un jugador, ¿a qué método se refiere? ¿De qué
 * objeto/clase? El hecho de plantarse, ¿a qué método se refiere? ¿De qué
 * objeto/clase? El hecho de preguntar el nombre al jugador, ¿a qué método se
 * refiere? ¿De qué objeto/clase? ¿En qué se diferencia una partida de otra?
 * ¿Coincide la baraja? ¿Qué tienen en común todas las partidas de siete y
 * media? ¿Utilizas algún valor constante?¿Utilizas enumeraciones?
 * 
 * @author Antonio Luque Bravo
 * @version 1.0
 */
public class TestPartida {
	public static void main(String[] args) {
		Jugador jugador1 = generarJugador();
		Jugador jugador2 = generarJugador();
		do {
			Partida partida = new Partida(jugador1, jugador2);
			turno(partida, jugador1);
			turno(partida, jugador2);
			partida.hallarGanador();
			System.out.println("Puntuación final: \n" + jugador1.getNombre()
					+ ": " + jugador1.getPuntuacion() + " puntos.\n"
					+ jugador2.getNombre() + ": " + jugador2.getPuntuacion()
					+ " puntos.");
		} while (Teclado.deseaContinuar());
	}

	/**
	 * Genera un jugador para la partida, pidiendole su alias.
	 * 
	 * @return devuelve el jugador.
	 */
	private static Jugador generarJugador() {
		Jugador jugador = new Jugador(
				Teclado.leerCadena("Introduce el nombre del jugador"));
		return jugador;
	}

	/**
	 * M&eacute;todo para el trascurso de la partida.
	 * 
	 * @param acumulador
	 *            puntuaci&oacute;n acumulada por el jugador en la partida.
	 * @param baraja
	 *            Baraja de la Siete y Media.
	 * @return devuelve los puntos que ha conseguido el jugador.
	 */
	private static void turno(Partida partida, Jugador jugador) {
		double puntuacion = 0;
		do {
			System.out.println("Es tu turno " + jugador.getNombre());
			puntuacion += partida.sacarCarta(partida.baraja);
			jugador.setPuntuacion(puntuacion);
			System.out.println("Puntuación hasta ahora: "
					+ jugador.getPuntuacion());
		} while (comprobarPuntuacion(jugador) && Teclado.deseaContinuar());

	}

	private static boolean comprobarPuntuacion(Jugador jugador) {
		if (jugador.getPuntuacion() < 7.5)
			return true;
		if (jugador.getPuntuacion() == 7.5) {
			System.out
					.println("Has ganado. Has llegado a 7.5. Felicidades!!\n-------------------------");
			return false;
		} else {
			System.out
					.println("Has perdido. Te has pasado de 7.5.\n-------------------------");
			return false;
		}
	}

	/**
	 * Saca una carta de la baraja y devuelve su valor.
	 * 
	 * @param baraja
	 *            Baraja de la Siete y Media.
	 * @return devuelve el valor de la carta.
	 */
	private static double sacarCarta(Baraja baraja) {
		double puntuacion;
		Carta carta = baraja.sacarCarta();
		puntuacion = carta.getValor();
		System.out.println("Tu carta es: " + carta + "Lo que equivale a "
				+ puntuacion + " puntos.");
		return puntuacion;
	}

}
