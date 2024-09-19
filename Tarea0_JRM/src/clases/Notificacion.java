package clases;

import java.util.Date;

public class Notificacion {
	
	long id;
	Date fecha;
	String mensaje;
	
	
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public Date getFecha() {
		return fecha;
	}
	
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	public String getMensaje() {
		return mensaje;
	}
	
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	

	public Notificacion() {
		super();
	}

	public Notificacion(long id, Date fecha, String mensaje) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.mensaje = mensaje;
	}
	
	

}
