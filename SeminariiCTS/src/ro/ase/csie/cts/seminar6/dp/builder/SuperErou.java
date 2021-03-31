package ro.ase.csie.cts.seminar6.dp.builder;

public class SuperErou {

	private String nume;
	private int puncteViata;
	
	private boolean esteNegativ;
	private boolean esteRanitGrav;
	
	private InterfataArma armaStanga;
	private InterfataArma armaDreapta;
	private InterfataSuperPutere superPutere;
	private InterfataSuperPutere superSuperPutere;
	
	//default
	//constructorul default e de preferat sa fie privat mereu
	private SuperErou() {
		
	}

	private SuperErou(String nume, int puncteViata, boolean esteNegativ, boolean esteRanitGrav, InterfataArma armaStanga,
			InterfataArma armaDreapta, InterfataSuperPutere superPutere, InterfataSuperPutere superSuperPutere) {
		super();
		this.nume = nume;
		this.puncteViata = puncteViata;
		this.esteNegativ = esteNegativ;
		this.esteRanitGrav = esteRanitGrav;
		this.armaStanga = armaStanga;
		this.armaDreapta = armaDreapta;
		this.superPutere = superPutere;
		this.superSuperPutere = superSuperPutere;
	}
	
	
	//BUILDER
	//obligatoriu static pt a nu se comporta ca si cum e un constructor membru
	public static class SuperErouBuilder {
		
		SuperErou supererou;
		
		//constructor pt builder
		public SuperErouBuilder(String nume, int puncteViata) {
			this.supererou = new SuperErou();
			this.supererou.nume = nume;
			this.supererou.puncteViata = puncteViata;	
		}
		
		//INTORC REFERINTA CATRE BUILDER
		public SuperErouBuilder esteNegativ() {
			this.supererou.esteNegativ = true;
			return this;
		}
		
		public SuperErouBuilder esteRanit() {
			this.supererou.esteRanitGrav = true;
			return this;
		}
		
		public SuperErouBuilder setArmaStanga(InterfataArma arma) {
			this.supererou.armaStanga = arma;
			return this;
		}
		
		public SuperErouBuilder setArmaDreapta(InterfataArma arma) {
			this.supererou.armaStanga = arma;
			return this;
		}
		
		public SuperErouBuilder setSuperPutere(InterfataSuperPutere superPutere) {
			this.supererou.superPutere = superPutere;
			return this;
		}
		
		public SuperErouBuilder setSuperSuperPutere(InterfataSuperPutere superSuperPutere) {
			this.supererou.superSuperPutere = superSuperPutere;
			return this;
		}
		
		public SuperErou build() {
			return this.supererou;
		}
		
	}
	
	
}
