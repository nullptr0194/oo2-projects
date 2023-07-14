package skijanje;

public class Teska extends Deonica {

	private char oznaka = 'T';
	
	public Teska(double duz, double nag) {
		super(duz, nag);
	}

	//public static final double g = 9.81;
	@Override
	public char oznaka() {
		return oznaka;
	}

	@Override
	public double ubrzanje() {
		return 9.81*Math.sin(this.nagib()*Math.PI/180);
	}

		
}
