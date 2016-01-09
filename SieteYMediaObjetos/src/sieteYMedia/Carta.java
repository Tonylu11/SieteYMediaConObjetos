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
	 * Valor de la carta.
	 */
	private double valor;

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
	Carta(Palos palo, Figuras figura, double valor) {
		this.palo = palo;
		this.figura = figura;
		this.valor = figura.getPuntos();
	}

	/**
	 * Obtiene el valor de la figura de la carta.
	 * 
	 * @return devuelve el valor de la figura de la carta.
	 */
	double getValor() {
		return valor;
	}

	/**
	 * Muestra el contenido de la carta
	 */
	@Override
	public String toString() {
		return figura + " DE " + palo + "\n";
	}
}