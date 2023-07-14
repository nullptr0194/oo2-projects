package skijanje;

public abstract class Deonica {
	private double duzina, nagib;
	
	public Deonica(double d, double n) {
		this.duzina = d;
		this.nagib = n;	
	}

	public double duzina() {
		return duzina;
	}

	public void setDuzina(double duzina) {
		this.duzina = duzina;
	}

	public double nagib() {
		return nagib;
	}

	public void setNagib(double nagib) {
		this.nagib = nagib;
	}

	public abstract char oznaka();
	public abstract double ubrzanje();

	public double brzina(double vp) {
		double vk= Math.sqrt(2*this.ubrzanje()*this.duzina()+2*Math.pow(vp, 2));
		return vk;
	}
	public double vreme(double vp) {
		double t = (this.brzina(vp)-vp)/this.ubrzanje();
		return t;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.oznaka());
		sb.append("(").append(this.duzina).append(",").append(this.nagib).append(")");

		return sb.toString();
		//return "Deonica [duzina=" + duzina + ", nagib=" + nagib + "]";
	}


}