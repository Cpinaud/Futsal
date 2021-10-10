package ar.edu.unlam.pb2.Fustal;

public class Partido {

	private Equipo local;
	private Equipo visitante;

	public Partido(Equipo local, Equipo visitante) {
		this.local = local;
		this.visitante=visitante;
	}

	public Equipo getLocal() {
		
		return this.local;
	}

	public Object getVisitante() {
		// TODO Auto-generated method stub
		return this.visitante;
	}

}
