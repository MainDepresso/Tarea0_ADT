package clases;

public enum TipoPago {
	
	E('E',"Efectivo"),T('T',"Transferencia"),C('C',"Tarjeta de crédito");
	
	char letra;String nombre;
	
	TipoPago (char letra, String nombre){
		this.letra=letra;this.nombre=nombre;
	}

	public char getLetra() {
		return letra;
	}

	public void setLetra(char letra) {
		this.letra = letra;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

}
