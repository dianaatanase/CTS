package ro.ase.csie.cts.seminar11.observer;

public class TestOberver {

	public static void main(String[] args) {
		
		ModulConexiuneInternet modulConexiune = new ModulConexiuneInternet();
		
		ModulAutoSave modulSalvare = new ModulAutoSave();
		ModulNotificareJucator modulNotificari = new ModulNotificareJucator();
		
		modulConexiune.registerModul(modulNotificari);
		modulConexiune.registerModul(modulSalvare);
		
		modulConexiune.pierdeConexiune();
		
		modulConexiune.unregisterModul(modulSalvare);
		
		modulConexiune.pierdeConexiune();

	}

}
