package fakultet;

public class Nastavnik extends Osoba {
	
	private Zvanje zvanje;
	private char oznaka = 'N';
	
	
	public enum Zvanje {
		prof,
		doc
	}
	
	public Nastavnik(String i, String p, Zvanje zv ) {
		super(i,p);
		this.zvanje = zv;
	}
	
	@Override
	public char getOznaka() {
		return this.oznaka;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.zvanje).append(". dr ");
		
		
		return sb.toString()+super.toString();
		//return "Nastavnik [Zvanje=" + Zvanje + ", oznaka=" + oznaka + "]";
	}
	
	public static void main(String[] arg) {
		Nastavnik n1 = new Nastavnik("Laza", "Lazic", Nastavnik.Zvanje.prof);
		System.out.println(n1);
	}
	
}
