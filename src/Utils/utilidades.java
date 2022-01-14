package Utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class utilidades {
	/**
	 * Metodo que devuelve un entero con control de errores, el texto que recibe el
	 * metodo lo imprime por pantalla antes de recoger la variable por teclado.
	 * 
	 * @param text
	 * @return int
	 */
	public static int LeeInt(String text) {

		boolean validNum = true;
		Scanner scan = new Scanner(System.in);
		int n = 0;

		do {
			try {
				System.out.println(text);
				n = scan.nextInt();

				if (n < 0) {
					validNum = true;
					System.out.println("Debe ingresar obligatoriamente un numero valido.");
				} else {
					validNum = false;
				}

			} catch (InputMismatchException ex) {

				scan.nextLine();
				validNum = true;
				System.out.println("Debe ingresar obligatoriamente un numero valido.");

			} catch (Exception e) {

				scan.nextLine();
				validNum = true;
				System.out.println("Debe ingresar obligatoriamente un numero valido.");

			}
		} while (validNum);

		return n;
	}
}
