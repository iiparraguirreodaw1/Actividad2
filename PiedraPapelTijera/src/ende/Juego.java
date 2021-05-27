package ende;

/**
 * Simula el juego de Piedra, Papel o tijera
 */


public class Juego 
{
    public static void main(String args[])
    {
    	//Atributos
    	//Constantes
    	//Variables
    	Jugador p1 =new Jugador();
        Jugador p2 =new Jugador();
        
        boolean fin_de_juego = false;
        //Número de rondas jugadas
        Integer Rondasjugadas = 0;
        
        Integer exitosJugador1 = p1.exitos;
        Integer exitosJugador2 = p2.exitos;
        Integer empates = 0;
        String opcionJugador1; 
        String opcionJugador2;
        
        // Bucle del juego
        do
        {
            System.out.println("***** Ronda: " + Rondasjugadas+" *********************\n");
            System.out.println("Numero de empates: "+ empates + "\n");
            
            opcionJugador1 = p1.opcion_al_azar();
            
            System.out.println("Jugador 1: " + opcionJugador1 + "\t Jugador 1 - Partidas ganadas: " + exitosJugador1);
            opcionJugador2 = p2.opcion_al_azar();
            System.out.println("Jugador 2: " + opcionJugador2 + "\t Jugador 2 - Partidas ganadas: " + exitosJugador2);
            
            if((opcionJugador1.equals("piedra")) && (opcionJugador2.equals("papel")))
            {
                System.out.println("Jugador 2 GANA");
                exitosJugador2 = p2.exitos ++;
                
            }
            if((opcion_JUGADOR1.equals("papel"))&&(opcion_JUGADOR2.equals("piedra")))
            {
            	EXITOS_jugador1 = ++p1.exitos;
                System.out.println("Jugador 1 GANA");
            }
            if((opcion_JUGADOR1.equals("piedra"))&&(opcion_JUGADOR2.equals("tijeras")))
            {
            	EXITOS_jugador1 = ++p1.exitos;
                System.out.println("Jugador 1 GANA");
            }
            if((opcion_JUGADOR1.equals("tijeras"))&&(opcion_JUGADOR2.equals("piedra")))
            {
            	EXITOS_jugador2 = ++p2.exitos;
                System.out.println("Jugador 2 GANA");
            }
            if((opcion_JUGADOR1.equals("tijeras"))&&(opcion_JUGADOR2.equals("papel")))
            {
            	EXITOS_jugador1 = ++p1.exitos;
                System.out.println("Jugador 1 GANA");
            }
            if((opcion_JUGADOR1.equals("papel"))&&(opcion_JUGADOR2.equals("tijeras")))
            {
            	EXITOS_jugador2 = ++p2.exitos;
                System.out.println("Jugador 2 GANA");
            }
            if(opcion_JUGADOR1==opcion_JUGADOR2)
            {
            	EmPaTeS++;
                System.out.println("\n\t\t\t Empate \n");
            }
            Rondasjugadas++;
            if((p1.exitos>=3)||(p2.exitos>=3))
            {
            	fin_de_juego=true;
                System.out.println("FIN DEL JUEGO!!");
            }
            System.out.println();
        } while(fin_de_juego!=true);
    }
}
/**
 *
 */
class Jugador{
   
    /**
     * Escoge piedra, papel o tijera al azar
     */
	
    public String opcion_al_azar()
    {
        String opcion="";
        Integer c = (int)(Math.random()*3);
        switch(c){
            case 0:
            	opcion=("piedra");
                break;
            case 1:
            	opcion=("papel");
                break;
            case 2:
            	opcion=("tijeras");
        }
        return opcion;
    }

	int exitos;      // número de partidas ganadas
    int winTotal;
}
