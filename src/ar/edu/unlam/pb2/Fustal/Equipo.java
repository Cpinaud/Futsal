package ar.edu.unlam.pb2.Fustal;

public class Equipo {

	private String nombre;
	private Jugador[] jugadores ;
	private Integer posicionActualGoles;
	private Integer posicionActualJugador;
	private Gol[] goles;
	

	public Equipo(String nombre) {
		this.nombre=nombre;
		this.jugadores = new Jugador [5];
		this.posicionActualJugador=0;
		this.posicionActualGoles=0;
		this.goles = new Gol [100];
	}

	public Jugador getJugador(Integer i) {
		Jugador jugador = this.jugadores[i];
		return jugador;
	}

	public void agregarJugador(String string, Double costo, Integer edad) {
		Jugador jugador = new Jugador (string,costo,edad);	
		this.jugadores[posicionActualJugador] = jugador;
		posicionActualJugador++;
	}

	public Double obtenerValor() {
		Double valorTotal = 0.0;
		for(int i = 0;i<this.jugadores.length;i++) {
			valorTotal+=this.jugadores[i].getValor();
		}
		return valorTotal;
	}

	public Double obtenerPromedioEdad() {
		Double promedioEdad = 0.0;
		for(int i = 0;i<this.jugadores.length;i++) {
			promedioEdad+=this.jugadores[i].getEdad();
		
		}
		promedioEdad = promedioEdad / jugadores.length;
		return promedioEdad;
		}

	public void registrarGol(String jugador,Double minuto) {
		this.goles[posicionActualGoles]= new Gol (jugador,minuto);
		posicionActualGoles++;
		/*for(int i = 0;i<this.jugadores.length;i++) {
			if(this.jugadores[i].getNombre().equals(jugador)) {
				Gol gol = new Gol(jugador,minuto);
				this.goles[posicionActualGoles] = gol;
				posicionActualGoles++;
			}
				
		}*/

	}

	public Gol getGol(Integer posicion) {
		Gol gol = this.goles[posicion];
		return gol;
	}

	public Integer getCantGoles() {
		
		return posicionActualGoles;
	}

}
