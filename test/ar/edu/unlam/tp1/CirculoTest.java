package ar.edu.unlam.tp1;

import static org.junit.Assert.*;
import Circulo;

import org.junit.Test;

public class CirculoTest {
	
	@Test
	public void crearUnCirculoConRadio2() {
		Circulo miCirculo = new Circulo(2.0);
		
		assertEquals(2.0, miCirculo.getRadio(), 0.01);
	}
	
	@Test
	public void crearUnCirculoConRadio3Punto7() {
		Circulo miCirculo = new Circulo(3.7);
		
		assertEquals(3.7, miCirculo.getRadio(), 0.01);
	}
	
	@Test
	public void crearUnCirculoConRadio5() {
		Circulo miCirculo = new Circulo(5.0);
		
		assertEquals(5.0, miCirculo.getRadio(), 0.01);
	}
	
	@Test
	public void crearUnCirculoConRadio10Punto9() {
		Circulo miCirculo = new Circulo(10.9);
		
		assertEquals(10.9, miCirculo.getRadio(), 0.01);
	}
	
	@Test
	public void queElAreaDeUnCirculoConRadio9Punto8Es615Punto73() {
		Circulo miCirculo = new Circulo(9.8);
		
		assertNotEquals(615.73, miCirculo.CalcularArea(), 0.01);
	}
	
	@Test
	public void crearUnCirculoConRadio16Punto6Es865Punto67() {
		Circulo miCirculo = new Circulo(16.6);
		
		assertNotEquals(865.67, miCirculo.CalcularArea(), 0.01);
	}
	
	@Test
	public void queElTipDeAyudaDeVerde(){ // :)
		
		Double esperado = 1.10;
		Double actual = 1.10;
		
		/**
		 *  Recordar que el siguiente método se puede usar por que al inicio del archivo
		 *  se importaron todos los assert con la siguiente linea 
		 *  import static org.junit.Assert.*; 
		 */
		 
		assertEquals(esperado.doubleValue(), actual.doubleValue(),0.01);
	}
	

}
