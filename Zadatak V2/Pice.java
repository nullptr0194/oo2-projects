package kafic;

import java.util.Objects;

public abstract class Pice {
	private String naziv;
	private float zapremina;
	private int cenaPoLitru;
	
	public Pice(String ime, float l, int cena) {
		this.naziv = ime;
		this.zapremina = l;
		this.cenaPoLitru = cena;
	}
	
	public double getCena() {
		return this.zapremina*this.cenaPoLitru;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public float getZapremina() {
		return zapremina;
	}
	public void setZapremina(float zapremina) {
		this.zapremina = zapremina;
	}
	public abstract char getOznaka();
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.naziv);
		sb.append(" (").append(String.format("%.2f", this.zapremina));
		sb.append(" L): ").append(String.format("%.2f", this.getCena()));
		sb.append(" RSD");
		
		return sb.toString();
		//return "Pice [zapremina=" + zapremina + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pice other = (Pice) obj;
		return Objects.equals(naziv, other.naziv)
				&& Double.doubleToLongBits(zapremina) == Double.doubleToLongBits(other.zapremina);
	}
	

}
