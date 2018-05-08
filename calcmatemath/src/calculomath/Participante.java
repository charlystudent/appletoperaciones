package calculomath;



public class Participante implements Comparable <Participante> {
	private String nom;
	private Integer puntos;
	
	
	public Participante(String nombre, Integer puntos) {
		super();
		this.nom = nombre;
		this.puntos = puntos;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Integer getPuntos() {
		return puntos;
	}
	public void setPuntos(Integer puntos) {
		this.puntos = puntos;
	}
	@Override
	public String toString() {
		return "Nombre=" + nom + ", Puntos=" + puntos;
	}
	@Override
	public int compareTo(Participante t) {
		// TODO Auto-generated method stub
		return nom.compareTo(t.getNom());
	}

}


