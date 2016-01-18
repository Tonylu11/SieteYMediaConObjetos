package sieteYMedia;

/**
 * Clase para la creaci&oacute;n de un jugador.
 * 
 * @author Antonio Luque Bravo
 * @version 1.0
 */
public class Jugador {
	/**
	 * Nombre del jugador.
	 */
	private String nombre;
	private double puntuacion;

	/**
	 * Costructor para generar un jugador.
	 * 
	 * @param nombre
	 *            Nombre del jugador.
	 */
	Jugador(String nombre) {
		setNombre(nombre);
	}

	/**
	 * Asigna el valor pasado por parametro de nombre al objeto Jugador.
	 * 
	 * @param nombre
	 *            Nombre del jugador.
	 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setPuntuacion(double puntuacion) {
		this.puntuacion = puntuacion;
	}

	public double getPuntuacion() {
		return puntuacion;
	}
}
