package fakultet;

public class Student extends Osoba {
	
	private static int brSlIndeksa = 0;
	private int brIndeksa = brSlIndeksa++;
	private int godina;
	private char oznaka = 'S';
	
	
	public Student(String i, String p, int god) {
		super(i, p);
		this.godina=god;
	}
	
	@Override
	public char getOznaka() {
		return this.oznaka;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.godina).append("/");
		sb.append(String.format("%04d", this.brIndeksa));
		sb.append("-").append(super.toString());
		//da li moze da se pozove to string iz nadklase?
		
		return sb.toString();
		//return "Student [brIndeksa=" + brIndeksa + ", godina=" + godina + ", oznaka=" + oznaka + "]";
	}
	
	

}
