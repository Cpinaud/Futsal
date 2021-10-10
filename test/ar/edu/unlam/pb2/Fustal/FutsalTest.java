package ar.edu.unlam.pb2.Fustal;

import static org.junit.Assert.*;

import org.junit.Test;

public class FutsalTest {

	@Test
	public void queSePuedanAgregarJugadoresAUnEquipo() {
		Equipo equipo1 = new Equipo("Velez Sarsfield");
		equipo1.agregarJugador("Messi",3000000.00,39);
		assertNotNull(equipo1.getJugador(0));
		
	}
	
	@Test
	public void queSePuedaObtenerElValorCorrectoDelEquipo() {
		Equipo equipo1 = new Equipo("Velez Sarsfield");
		equipo1.agregarJugador("Messi",300.00,39);
		equipo1.agregarJugador("Ronaldo",400.00,43);
		equipo1.agregarJugador("Agüero",100.00,28);
		equipo1.agregarJugador("Di Maria",200.00,32);
		equipo1.agregarJugador("Mbappe",80.00,23);
		Double valorEsperado = 1080.00;
		Double valorObtenido = equipo1.obtenerValor();
		assertEquals(valorEsperado,valorObtenido);
		
	}
	
	@Test
	public void queSePuedaCalcularLaEdadPromedioDeUnEquipo() {
		Equipo equipo1 = new Equipo("Velez Sarsfield");
		equipo1.agregarJugador("Messi",300.00,39);
		equipo1.agregarJugador("Ronaldo",400.00,43);
		equipo1.agregarJugador("Agüero",100.00,28);
		equipo1.agregarJugador("Di Maria",200.00,32);
		equipo1.agregarJugador("Mbappe",80.00,23);
		Double valorEsperado = 33.00;
		Double valorObtenido = equipo1.obtenerPromedioEdad();
		assertEquals(valorEsperado,valorObtenido);
		
	}
	
	
	@Test
	public void queSePuedaCrearUnPartido() {
		Equipo local = new Equipo("Velez Sarsfield");
		Equipo visitante = new Equipo("Chicago");
		Partido partido1 = new Partido(local,visitante);
		assertNotNull(partido1);
		
	}
	
	@Test
	public void queSePuedaRegistrarUnGol() {
		Equipo local = new Equipo("Velez Sarsfield");
		local.agregarJugador("Messi",300.00,39);
		local.agregarJugador("Agüero",1200.00,32);
		local.agregarJugador("Di Maria",890.00,45);
		local.agregarJugador("Xavi",400.00,37);
		local.agregarJugador("Fernandez", 234.33, 19);
		Equipo visitante = new Equipo("Chicago");
		visitante.agregarJugador("Messi", 1200.00, 45);
		visitante.agregarJugador("Di Maria", 890.00, 19);
		visitante.agregarJugador("Xavi", 400.00, 32);
		visitante.agregarJugador("Agüero",234.33, 39);
		visitante.agregarJugador("Fernandez", 300.000, 37);
		local.registrarGol("Messi",14.24);
		assertNotNull(local.getGol(0));
		Integer valorEsperado = 1;
		Integer valorObtenido = local.getCantGoles();
		assertEquals(valorEsperado,valorObtenido);
		
	}
	
	

}
