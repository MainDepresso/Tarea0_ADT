package clases;

import java.util.ArrayList;
import java.util.Date;

public class Cliente {
	
	Documentacion id;
	String nombre;
	String direccion;
	String telefono;
	Date fechaNac;
	boolean suscripcion;
	TipoPago pagoPref;
	ArrayList <Notificacion> notificaciones=new ArrayList<Notificacion>();

}
