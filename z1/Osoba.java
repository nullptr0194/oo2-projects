package fakultet;

public abstract class Osoba {

	public String ime, prezime;
	
	abstract public char getOznaka();
	
	public Osoba(String i, String p) {
		this.ime=i;
		this.prezime = p;
		
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(this.ime).append(" ").append(this.prezime);
		
		
		return sb.toString();
		//return "Osoba [ime=" + ime + ", prezime=" + prezime + "]";
	}
	
	
	
	
	
}
