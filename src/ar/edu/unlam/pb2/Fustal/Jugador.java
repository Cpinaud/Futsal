package ar.edu.unlam.pb2.Fustal;

public class Jugador {

	private String nombre;
	private Double costo;
	private Integer edad;

	public Jugador(String nombre, Double costo , Integer edad) {
		this.nombre = nombre;
		this.costo=costo;
		this.edad=edad;
	}

	public Double getValor() {
		Double costo = this.costo;
		return costo;
	}

	public Integer getEdad() {
		Integer edad = this.edad;
		return edad;
	}

	public String getNombre() {
		String nombre = this.nombre;
		return nombre;
	}

}
