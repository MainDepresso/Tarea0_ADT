package main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;

import clases.*;

public class Main {

	public static void main(String[] args) {
		
		/*char a='a';
		if ("abcd".contains(Character.toString(a)));*/
		
		try {
			File f=new File("prueba.txt");
			DataOutputStream dot=new DataOutputStream(new FileOutputStream(f));
			try {
				dot.writeBytes("Hola, adiós\nnnn");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
