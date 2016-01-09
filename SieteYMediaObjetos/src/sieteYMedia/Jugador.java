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

	/**
	 * M%eacute;todo para mostrar una salutaci&oacute;n junto al nombre del
	 * jugador.
	 */
	@Override
	public String toString() {
		return "Bienvenido " + nombre;
	}

}
