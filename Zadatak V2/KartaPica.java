package kafic;
import java.util.ArrayList;
import java.util.List;

//import kafic.Sok.Vrsta;

public class KartaPica {
	private List<Pice> listaPica;
	
	public KartaPica() {
		listaPica = new ArrayList();
	}
	public void dodajPice(Pice p1) throws GPostoji  {
		for(Pice p: listaPica) {
			if(p.equals(p1) == true)
				throw new GPostoji();		
		}
		listaPica.add(p1);
	}
	
	public int getBrojPica() {
		return listaPica.size();
		}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("GAZIRANI SOKOVI");
		
		for(Pice pg: listaPica) {
			if (pg.getOznaka() == 'g') {
				sb.append("\n").append(pg);
			}
		}
		sb.append("\nNEGAZIRANI SOKOVI");
		for(Pice pn: listaPica) {
			if (pn.getOznaka() == 'n') {
				sb.append("\n").append(pn);
			}
		}
		
		return sb.toString();
	}
	
	
	
	
}
