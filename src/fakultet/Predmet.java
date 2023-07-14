package fakultet;
import java.util.ArrayList;
import java.util.List;

public class Predmet {

	String naziv, sifra;
	private List<Osoba> listaOsoba;
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getSifra() {
		return sifra;
	}
	public void setSifra(String sifra) {
		this.sifra = sifra;
	}
	
	public Predmet(String n, String s) {
		listaOsoba = new ArrayList();
		this.naziv=n;
		this.sifra=s;
	}
	public void dodajOsobu(Osoba o1) throws GViseNastavnika {
		//ili da stavim staticku promenljivu ili da svaki put prolazim kroz listu
		
		if(o1.getOznaka() == 'N') {
			boolean postojiNastavnik = false;
			for(Osoba o: listaOsoba) {
				if(o.getOznaka() == 'N') {
					postojiNastavnik = true;
					break;
				}
			}
			if(postojiNastavnik) throw new GViseNastavnika();
		}
		listaOsoba.add(o1);
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		//StringBuilder sb1 = new StringBuilder();
		
		sb.append(this.naziv).append(" (").append(this.sifra).append(")");
		
			for(Osoba o:listaOsoba) {
				sb.append("\n").append(o.toString());
			}
		
		
		//for(Osoba o:listaOsoba) {
		//	if(o.getOznaka() == 'N')
		//		sb.append("\n").append(o.toString());
		//	else if(o.getOznaka() == 'S')
		//		sb.append("\n").append(o.toString());
		//}
		//sb.append(sb1.toString());
		return sb.toString();
		//return "Predmet [naziv=" + naziv + ", sifra=" + sifra + ", listaOsoba=" + listaOsoba + "]";
	}
	
	
}
