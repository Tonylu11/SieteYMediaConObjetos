package sieteYMedia;

/**
 * Carta de la Baraja de la Siete y Media.
 * 
 * @author Antonio Luque Bravo
 * @version 1.0
 */
public class Carta {
	/**
	 * Palo de la carta.
	 */
	private Palos palo;
	/**
	 * Figura de la carta.
	 */
	private Figuras figura;

	/**
	 * Constructor para la clase Carta.
	 * 
	 * @param palo
	 *            palo de la carta.
	 * @param figura
	 *            figura de la carta.
	 * @param valor
	 *            valor de la figura de la carta.
	 */
	Carta(Palos palo, Figuras figura) {
		this.palo = palo;
		this.figura = figura;
	}

	public Palos getPalo() {
		return palo;
	}

	public void setPalo(Palos palo) {
		this.palo = palo;
	}

	public Figuras getFigura() {
		return figura;
	}

	public void setFigura(Figuras figura) {
		this.figura = figura;
	}

	public double getValor() {
		return figura.getPuntos();
	}

	/**
	 * Muestra el contenido de la carta
	 */
	@Override
	public String toString() {
		return figura + " DE " + palo + "\n";
	}
}