package clases;

public class Nie extends Documentacion {
	
	String numero;
	char letraInicial;
	char letraFinal;
	
	
	
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public char getLetraInicial() {
		return letraInicial;
	}
	
	public void setLetraInicial(char letraInicial) {
		this.letraInicial = letraInicial;
	}
	
	public char getLetraFinal() {
		return letraFinal;
	}
	
	public void setLetraFinal(char letraFinal) {
		this.letraFinal = letraFinal;
	}
	
	

	public Nie() {
		super();
	}

	public Nie(String numero, char letraInicial, char letraFinal) {
		super();
		this.numero = numero;
		this.letraInicial = letraInicial;
		this.letraFinal = letraFinal;
	}
	
	
	
	public void validar() {
		
		String letras="QWERTYPASDFGHJKLZXCVBNM";
		
		if (letras.contains(Character.toString(this.letraInicial))
				&& letras.contains(Character.toString(this.letraFinal))
				&& valNum(this.numero)) 
		{
			
		}
		
	}
	
	public static Boolean valNum(String nDni) {
		
		boolean b=false;
		int nLength=nDni.length();
		String numeros="1234567890";
		
		if (nLength==8)
		{
			for (int i=0;i<nLength;i++)
			{
				if (numeros.contains(Character.toString(nDni.charAt(i))))
				{
					b=true;
				}
				else
				{
					b=false;
					break;
				}
			}
		}
		else
		{
			b=false;
		}
		
		return b;
		
	}
	
	public void mostrar() {
		
		System.out.println(this.letraInicial+this.numero+this.letraFinal);
		
	}

}
