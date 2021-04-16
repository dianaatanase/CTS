package ro.ase.csie.cts.seminar5.flyweight;


//pentru a gestiona starea temporara
public class ContextEcran {
	
	int x;
	int y;
	String culoareTextura;
	public ContextEcran(int x, int y, String culoareTextura) {
		super();
		this.x = x;
		this.y = y;
		this.culoareTextura = culoareTextura;
	}
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public String getCuloareTextura() {
		return culoareTextura;
	}
	

}
