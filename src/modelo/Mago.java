package modelo;

public class Mago extends Personaje{
	private int poderDefensaEspecial;

	public Mago(String nombre, int vida, int ataque, int defensa, int poderDefensaEspecial) {
		super(nombre, vida, ataque, defensa);
		this.poderDefensaEspecial = poderDefensaEspecial;
	}

	public Mago() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPoderDefensaEspecial() {
		return poderDefensaEspecial;
	}

	public void setPoderDefensaEspecial(int poderDefensaEspecial) {
		this.poderDefensaEspecial = poderDefensaEspecial;
	}

	@Override
	public String toString() {
		return "MAGO \nNombre= " + getNombre() + "\nVida= " + getVida() + "\nAtaque= " + getAtaque() + "\nDefensa= " + getDefensa() + "\nPoderDefensaEspecial= " + poderDefensaEspecial ;
	}	
	
}
