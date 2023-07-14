package skijanje;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class Staza {

	private String naziv;
	private List<Deonica> listaStaza;
	
	
	public Staza(String ime) {
		this.naziv = ime;
		listaStaza = new ArrayList();
	}
	public void dodaj(Deonica deo1) {
		listaStaza.add(deo1);
		
	}
	public int broj() {
		return listaStaza.size();	
	}
	public double duzina() {
		double sum=0;
		for(Deonica d1: listaStaza) {
			sum+=d1.duzina();
		}
		return sum;
	}
	public double nagib() {
		double max=Integer.MIN_VALUE;
		for(Deonica d1: listaStaza) {
			max = max>d1.nagib()?max=d1.nagib():max;
		}
		return max;	
	}
	public char oznaka() throws GOznaka{
		if(listaStaza.isEmpty()) throw new GOznaka();
		HashMap<Character, Integer> mapa = new HashMap< Character, Integer>();
		for(Deonica d1:listaStaza) {
			char c = d1.oznaka();
			if(!mapa.containsKey(c)) mapa.put(c, 1);
			else mapa.replace(c, mapa.get(c)+1);
			
		}
		//....
		return 'T';
	}
	//.....
	public double brzina(double vp) {
		return 1;
	}
	public double vreme(double vp) {
		return 1;
	}

	@Override
	public String toString() {
		return "Staza [naziv=" + naziv + ", listaStaza=" + listaStaza + "]";
	}

	
	
}
