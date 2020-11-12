package es.studium.MayusculasMinusculas;

import java.util.Scanner;

public class MayusculasMinusculas
{

	public static void main(String[] args)
	{
		String cadena = new String();
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca una cadena: ");
		cadena = teclado.nextLine();
		System.out.println("Mayúsculas: " + cadena.toUpperCase());
		System.out.println("Minúsculas: " + cadena.toLowerCase());
		System.out.println();
		teclado.close();
	}

}
