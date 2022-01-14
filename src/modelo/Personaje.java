package modelo;

public class Personaje {
	private String nombre;
	private int vida;
	private int ataque;
	private int defensa;

	public Personaje(String nombre, int vida, int ataque, int defensa) {
		super();
		this.nombre = nombre;
		this.vida = vida;
		this.ataque = ataque;
		this.defensa = defensa;
	}

	public Personaje() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getDefensa() {
		return defensa;
	}

	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}

	@Override
	public String toString() {
		return "Personaje [nombre=" + nombre + ", vida=" + vida + ", ataque=" + ataque + ", defensa=" + defensa + "]";
	}

	public boolean equals(Object obj) {
		boolean result = false;
		if (obj != null) {
			if (this == obj) {
				result = true;
			} else {
				if (this.getClass() == obj.getClass()) {
					Personaje tmp = (Personaje) obj;
					if (tmp != null && this.nombre != null && this.nombre == tmp.nombre) {
						result = true;
					}
				}
			}
		}
		return result;
	}
}
