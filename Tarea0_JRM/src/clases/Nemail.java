package clases;

import java.util.Date;

public class Nemail extends Notificacion {
	
	String direccion;
	
	

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Nemail() {
		super();
	}

	public Nemail(long id, Date fecha, String mensaje, String direccion) {
		super(id, fecha, mensaje);
		this.direccion=direccion;
	}

	
	
	

}
