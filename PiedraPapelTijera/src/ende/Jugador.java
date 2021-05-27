package ende;

public class Jugador {

	/**
	 * Escoge piedra, papel o tijera al azar
	 */
	
	// Atributos
	// Constantes
	// Variables
	
	// Número de partidas ganadas
	int exitos;
	int winTotal;

	public String opcion_al_azar() {
		String opcion = "";
		Integer c = (int) (Math.random() * 3);

		switch (c) {
		case 0:
			opcion = "piedra";
			break;
		case 1:
			opcion = "papel";
			break;
		case 2:
			opcion = "tijeras";
		}
		return opcion;
	}

	public int getExitos() {
		return this.exitos;
	}

	public int getWinTotal() {
		return this.winTotal;
	}

	public void setExitos(int cantExitos) {
		this.exitos = this.exitos + cantExitos;
	}

	public void setWinTotal(int cantWin) {
		this.winTotal = this.winTotal + cantWin;
	}
}
