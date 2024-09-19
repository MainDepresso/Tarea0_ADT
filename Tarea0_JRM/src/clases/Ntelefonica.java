package clases;

import java.util.Date;

public class Ntelefonica extends Notificacion {
	
	String numero;
	
	

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Ntelefonica() {
		super();
	}

	public Ntelefonica(long id, Date fecha, String mensaje, String numero) {
		super(id, fecha, mensaje);
		this.numero=numero;
	}
	
	
	
	
	

}
