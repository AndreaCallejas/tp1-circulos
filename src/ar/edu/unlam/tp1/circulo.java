package ar.edu.unlam.tp1;

public class circulo {
	
private Double radio;
	public void Circulo(Double radio) {
		this.radio = radio;
	}
	
	public Double getRadio(){
		return this.radio;
	}
	
	public Double CalcularPerimetro(){
		return 2 * Math.PI * this.radio;
	}
	
	public Double CalcularArea(){
		return Math.PI * (Math.pow(this.radio, 2.0));
	}
	
 
}
