package sieteYMedia;

import utiles.Teclado;

/**
 * Vamos a codificar el juego de las siete y media con los conocimientos que ya
 * tenemos.
 * 
 * Para su dise�o podr�amos utilizar:
 * 
 * Enumeraciones para los palos y las figuras (F�jate al final de este
 * enunciado) Clases para la carta, baraja, partida, jugador... Implementa el
 * m�todo toString() en la medida de lo posible. Ten en cuenta la programaci�n
 * por capas. La comunicaci�n con el usuario se hace a trav�s de la consola.
 * Puedes sobreCargar algunos m�todos para la comunicaci�n con el usuario
 * 
 * Recuerda que:
 * 
 * A las siete y media se juega con una baraja espa�ola de 40 cartas Supongamos
 * que s�lo pueden jugar dos jugadores. Inicialmente, que s�lo haya un jugador
 * Al principio del juego se indicar� el alias de los jugadores implicados.
 * (opcional) Se podr� averiguar el n�mero de partidas ganadas y perdidas por
 * cada jugador. (opcional) Se podr� mostrar el ranking de las partidas jugadas
 * (opcional)
 * 
 * Para que te plantees el dise�o te dejo estas preguntas:
 * 
 * El hecho de pedir una carta, �a qu� m�todo se refiere? �De qu� objeto/clase?
 * El hecho de plantarse un jugador, �a qu� m�todo se refiere? �De qu�
 * objeto/clase? El hecho de plantarse, �a qu� m�todo se refiere? �De qu�
 * objeto/clase? El hecho de preguntar el nombre al jugador, �a qu� m�todo se
 * refiere? �De qu� objeto/clase? �En qu� se diferencia una partida de otra?
 * �Coincide la baraja? �Qu� tienen en com�n todas las partidas de siete y
 * media? �Utilizas alg�n valor constante?�Utilizas enumeraciones?
 * 
 * @author Antonio Luque Bravo
 * @version 1.0
 */
public class TestBaraja {
	public static void main(String[] args) {
		do {
			double acumulador = 0;
			Baraja baraja = new Baraja();
			System.out.println(generarJugador());
			do {
				acumulador = partida(acumulador, baraja);
			} while (acumulador < 7.5 && Teclado.deseaContinuar());
			System.out.println("Puntuacion final de la partida: " + acumulador
					+ " pts");
		} while (Teclado.deseaContinuar());
	}

	/**
	 * Genera a un jugador para la partida, pidiendole su alias.
	 * 
	 * @return devuelve el jugador.
	 */
	private static Jugador generarJugador() {
		Jugador jugador1 = new Jugador(
				Teclado.leerCadena("Introduce el nombre del jugador"));
		return jugador1;
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
	private static double partida(double acumulador, Baraja baraja) {
		double puntuacion;
		System.out.println("Sacando una carta..\n");
		puntuacion = sacarCarta(baraja);
		acumulador += puntuacion;
		System.out.println("Llevas " + acumulador + " puntos en la partida.");
		comprobarPuntuacion(acumulador);
		return acumulador;
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

	/**
	 * Comprueba la puntuaci&oaute;n que acumula el jugador en la partida.
	 * 
	 * @param acumulador
	 *            puntos acumulados por el jugador.
	 */
	private static void comprobarPuntuacion(double acumulador) {
		if (acumulador == 7.5)
			System.out
					.println("Conseguiste 7 puntos y medio, has ganado. Enhorabuena!");
		else if (acumulador > 7.5)
			System.out
					.println("Sobrepasaste los 7 puntos y medio, has perdido.");
	}

}
