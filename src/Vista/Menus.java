package Vista;

import java.util.ArrayList;

import Utils.utilidades;

public class Menus {
	public static int Menu1() {
		int n = -1;
	System.out.println(" _______  ______  _______  _______  _______  _______  _______  _____   _______  _______ \r\n"
			+ "|   _   ||   __ \\|   |   ||   _   ||     __||   |   ||    ___||     \\ |       ||    |  |\r\n"
			+ "|       ||      <|       ||       ||    |  ||   |   ||    ___||  --  ||   -   ||       |\r\n"
			+ "|___|___||___|__||__|_|__||___|___||_______||_______||_______||_____/ |_______||__|____|");
		do {
			n = utilidades.LeeInt("¿Cuantos personajes quieres que luchen?**(max.10)**");
		} while (n<2||n>10);
		return n;
	}
		public static int Menu2(int n) {
			int n1 = -1;
			do {
			n1= utilidades.LeeInt("¿Qué personaje vas a elegir para luchar?**(El primer luchador es la opcion 0)**");
			}while (n1<0||n1>n-1);
			return n1;
		}
		public static void Menu3() {
			System.out.println("********************************************************************************************************************");
			System.out.println("* ->Ahora tu personaje va a pelear contra el resto de personajes.                                                  *");
			System.out.println("* ->El ataque y la defensa dependera siempre de un numero aleatorio entre 1 y el ataque/defensa base del personaje.*");
			System.out.println("* ->La vida de tu personaje SI se restaura tras cada combate.                                                      *");
			System.out.println("* ->Mucha suerte <3                                                                                                *");
			System.out.println("********************************************************************************************************************");
			System.out.println();
		}
}
