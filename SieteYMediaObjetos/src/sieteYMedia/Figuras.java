package sieteYMedia;

/**
 * Figuras de la baraja del juego de la Siete y Media.
 * 
 * @author Antonio Luque Bravo
 * @version 1.0
 */
public enum Figuras {
	UNO(1), DOS(2), TRES(3), CUATRO(4), CINCO(5), SEIS(6), SIETE(7), SOTA(0.5), CABALLO(
			0.5), REY(0.5);
	/**
	 * Puntos de la figura.
	 */
	private double puntos;

	/**
	 * Constructor que pone a la figura los puntos a lo que equivale.
	 * 
	 * @param puntos
	 *            puntos que vale la figura
	 */
	private Figuras(double puntos) {
		this.setPuntos(puntos);
	}

	/**
	 * Obtiene los puntos de la figura.
	 * 
	 * @return Devuelve los puntos de la figura.
	 */
	double getPuntos() {
		return puntos;
	}

	/**
	 * Asigna el valor pasado por parametro de puntos al objeto Figura.
	 * 
	 * @param puntos
	 *            puntos que vale la figura.
	 */
	private void setPuntos(double puntos) {
		this.puntos = puntos;
	}

}
