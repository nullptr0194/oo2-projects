package kafic;

public class Sok extends Pice {

	public enum Vrsta{
		GAZIRAN('g'),
		NEGAZIRAN('n');
		
		private final char naziv;
		private Vrsta(char c) {
			this.naziv = c;
		}
		private char vratiOznaku() {
			return this.naziv;
		}
		
	}
	
	private final Vrsta vrstaSoka;

	public Vrsta getVrsta() {
		return this.vrstaSoka;
	}
	@Override
	public char getOznaka() {
		return vrstaSoka.vratiOznaku();
	}

	public Sok(String naziv, float l, int cena, Vrsta vr) {
		super(naziv, l, cena);
		this.vrstaSoka = vr;
	}
	
}
