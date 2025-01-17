package Entidades;

/**
 * Define los mensaje posibles de solicitar por sobre las entidades de la aplicación, 
 * respecto de su capacidad de intercambiarse con otras entidades en el tablero.
 * @author FJoaquin (federico.joaquin@cs.uns.edu.ar)
 *
 */
public interface Intercambiable {
	/**
	 * Indica si es posible que la entidad receptora pueda ser intercambiada de posición con la entidad parametrizada.
	 * @param e Entidad con la que se analiza el intercambio.
	 * @return True si el intercambio es posible, false en caso contrario.
	 */
	public boolean es_posible_intercambiar(Entidad e);
	/**
	 * Indica si es posible que la entidad receptora pueda ser intercambiada de posición con el Caramelo parametrizado.
	 * @param c Caramelo con el que se analiza el intercambio.
	 * @return True si el intercambio es posible, false en caso contrario.
	 */
	public boolean puede_recibir(Caramelo c);
	/**
	 * Indica si es posible que la entidad receptora pueda ser intercambiada de posición con el Glaseado parametrizado.
	 * @param g Glaseado con el que se analiza el intercambio.
	 * @return True si el intercambio es posible, false en caso contrario.
	 */
	public boolean puede_recibir(Glaseado g);
	/**
	 * Indica si es posible que la entidad receptora pueda ser intercambiada de posición con el Potenciador parametrizado.
	 * @param p Potenciador con el que se analiza el intercambio.
	 * @return True si el intercambio es posible, false en caso contrario.
	 */
	public boolean puede_recibir(Potenciador p);
	/**
	 * Fija la nueva posición de la entidad receptora del mensaje.
	 * Notifica a la entidad gráfica del cambio realizado.
	 * @param nf Nueva fila de la entidad. 
	 * @param nc Nuevo columna de la entidad.
	 */
	public void cambiar_posicion(int nf, int nc);
}
