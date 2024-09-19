package clases;

public class Nif extends Documentacion {
	
	String numero;
	char letraFinal;
	
	
	
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public char getLetraFinal() {
		return letraFinal;
	}
	
	public void setLetraFinal(char letraFinal) {
		this.letraFinal = letraFinal;
	}
	
	

	public Nif() {
		super();
	}

	public Nif(String numero, char letraFinal) {
		super();
		this.numero = numero;
		this.letraFinal = letraFinal;
	}
	
	
	
	public void validar() {
		
		
		
	}
	
	public void mostrar() {
		
		System.out.println(this.numero+this.letraFinal);
		
	}

}
