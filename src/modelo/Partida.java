package modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import Vista.Menus;

public class Partida {

	public static void Partida() {
		Personaje[] personajes = new Personaje[10];

		int n1 = -1;// numero de jugadores que va a elegir
		int n2 = -1;// jugador con el que va a combatir

		Mago m1 = new Mago("Rafa", 25, 15, 17, 17);
		Mago m2 = new Mago("Antonio", 25, 16, 16, 16);
		Mago m3 = new Mago("Francisco", 25, 12, 20, 14);
		Mago m4 = new Mago("Marcial", 25, 14, 18, 15);
		Mago m5 = new Mago("Alonso", 25, 17, 13, 15);
		Guerrero g1 = new Guerrero("Marcos", 25, 17, 15, 15);
		Guerrero g2 = new Guerrero("Alejandro", 25, 15, 16, 19);
		Guerrero g3 = new Guerrero("Miguel", 25, 18, 13, 16);
		Guerrero g4 = new Guerrero("Luis", 25, 20, 10, 12);
		Guerrero g5 = new Guerrero("Carlos", 25, 16, 16, 16);

		personajes[0] = m1;
		personajes[1] = g1;
		personajes[2] = m2;
		personajes[3] = g2;
		personajes[4] = m3;
		personajes[5] = g3;
		personajes[6] = m4;
		personajes[7] = g4;
		personajes[8] = m5;
		personajes[9] = g5;

		n1 = Menus.Menu1();
		Personaje[] ListaPersonajes = new Personaje[n1];
		for (int j = 0; j < n1; j++) {
			ListaPersonajes[j] = personajes[j];
			System.out.println();
			System.out.println(ListaPersonajes[j]);
			System.out.println();
		}
		n2 = Menus.Menu2(n1);
		System.out.println();
		System.out.println("Personaje elegido:");
		System.out.println(ListaPersonajes[n2]);
		System.out.println();
		iniciaPartida(n2, ListaPersonajes);
	}

	private static void iniciaPartida(int n2, Personaje[] ListaPersonajes) {
		int l = 0;
		Menus.Menu3();
		Personaje[] pelea = new Personaje[3];
		pelea[0] = ListaPersonajes[n2];
		ListaPersonajes[n2] = null;
		for (int t = 0; t < ListaPersonajes.length; t++) {
			if (pelea[0] != null) {
				if (ListaPersonajes[t] != null) {
					pelea[0].setVida(25);
					pelea[1] = ListaPersonajes[t];
					lucha(pelea);
				}if(pelea[0]==null) {
					System.out.println("Tu Personaje ha muerto");
					System.out.println("Ha terminado la partida");
				}

			}
		}
		if (pelea[0] != null) {
			System.out.println("Tu Personaje ha ganado");
			System.out.println("Felicidades!!!!!");
		}

	}

	public static void lucha(Personaje[] pelea) {
		int ronda = 1;
		boolean validar = false;
		int resultadoAtaque = 0;
		int resultadoAtaqueEspecial = 0;
		int resultadoAtaqueTotal = 0;
		int resultadoDefensa = 0;
		int resultadoDefensaEspecial = 0;
		int resultadoDefensaTotal = 0;

		for (int n = 0, p = 1; validar != true; n++, p--) {
			if (n > 1) {
				n = 0;
				p = 1;
			}
			System.out.println("Ronda Nº" + ronda+" ------> "+pelea[0].getNombre()+" VS "+pelea[1].getNombre());
			System.out.println("**********************************");
			System.out.println("Ataca " + pelea[n].getNombre()+", con vida: "+pelea[n].getVida());
			resultadoAtaque = (int) Math.floor(Math.random() * (pelea[n].getAtaque() - 1 + 1) + 1);
			resultadoAtaqueTotal = resultadoAtaque;
			if (pelea[n]instanceof Guerrero g) {
				resultadoAtaqueEspecial = (int) Math.floor(Math.random() * (g.getPoderAtaqueEspecial() - 1 + 1) + 1);
				resultadoAtaqueTotal = resultadoAtaque + resultadoAtaqueEspecial;
			}
			System.out.println("El ataque tiene un daño de: " + resultadoAtaqueTotal);
			System.out.println();
			System.out.println("Defiende " + pelea[p].getNombre()+", con vida: "+pelea[p].getVida());
			resultadoDefensa = (int) Math.floor(Math.random() * (pelea[p].getDefensa() - 1 + 1) + 1);
			resultadoDefensaTotal = resultadoDefensa;
			if (pelea[p]instanceof Mago m) {
				resultadoDefensaEspecial = (int) Math.floor(Math.random() * (m.getPoderDefensaEspecial() - 1 + 1) + 1);
				resultadoDefensaTotal = resultadoDefensa + resultadoDefensaEspecial;
			}
			System.out.println("La defensa total es de: " + resultadoDefensaTotal);
			System.out.println();
			if (resultadoAtaqueTotal - resultadoDefensaTotal <= 0) {
				System.out.println();
				System.out.println("El ataque no ha sido lo suficientemente fuerte para quitarle vida.");
				System.out.println();
			}
			if (resultadoAtaqueTotal - resultadoDefensaTotal > 0) {
				System.out.println("El daño recibido es de: " + (resultadoAtaqueTotal - resultadoDefensaTotal));
				pelea[p].setVida(pelea[p].getVida() - (resultadoAtaqueTotal - resultadoDefensaTotal));
				System.out.println("La vida restante de " + pelea[p].getNombre() + " es de:" + pelea[p].getVida());
				System.out.println();
			}
			if (pelea[p].getVida() <= 0) {
				System.out.println("***************************************");		
				System.out.println("         " + pelea[p].getNombre() + " ha muerto." + "          ");
				System.out.println("***************************************");
				pelea[p] = null;
				validar = true;
			}
			ronda++;
		}
	}

}
