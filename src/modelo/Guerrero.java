package modelo;

public class Guerrero extends Personaje{
	private int poderAtaqueEspecial;

	public Guerrero(String nombre, int vida, int ataque, int defensa, int poderAtaqueEspecial) {
		super(nombre, vida, ataque, defensa);
		this.poderAtaqueEspecial = poderAtaqueEspecial;
	}

	public Guerrero() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPoderAtaqueEspecial() {
		return poderAtaqueEspecial;
	}

	public void setPoderAtaqueEspecial(int poderAtaqueEspecial) {
		this.poderAtaqueEspecial = poderAtaqueEspecial;
	}

	@Override
	public String toString() {
		return "GUERRERO\nNombre= " + getNombre() + "\nVida= " + getVida() + "\nAtaque= " + getAtaque() + "\nDefensa= " + getDefensa() + "\nPoderAtaqueEspecial= " + poderAtaqueEspecial ;
	}
	
}
