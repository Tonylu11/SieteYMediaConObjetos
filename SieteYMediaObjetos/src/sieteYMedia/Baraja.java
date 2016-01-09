package sieteYMedia;

/**
 * Baraja de la Siete Y Media.
 * 
 * @author Antonio Luque Bravo
 * @version 1.0
 */
public class Baraja {
	/**
	 * N&uacute;mero de cartas en la baraja.
	 */
	private final int NUM_CARTAS = 40;
	/**
	 * Array de cartas.
	 */
	private Carta[] cartas = new Carta[NUM_CARTAS];

	/**
	 * Costructor para la baraja de la Siete Y Media.
	 */
	Baraja() {
		int i = 0;
		for (Palos palo : Palos.values())
			for (Figuras figura : Figuras.values())
				cartas[i++] = new Carta(palo, figura, figura.getPuntos());
	}

	/**
	 * M&eacute;todo para sacar una carta de la baraja.
	 * 
	 * @return carta en cuesti&oacute;n.
	 */
	Carta sacarCarta() {
		int aleatorio = (int) (Math.random() * NUM_CARTAS);
		do {
			if (cartas[aleatorio] != null) {
				Carta mano = cartas[aleatorio];
				cartas[aleatorio] = null;
				return mano;
			} else {
				aleatorio++;
				aleatorio = aleatorio % NUM_CARTAS;
			}
		} while (true);
	}
}
