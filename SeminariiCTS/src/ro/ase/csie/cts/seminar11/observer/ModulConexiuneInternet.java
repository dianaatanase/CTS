package ro.ase.csie.cts.seminar11.observer;

import java.util.ArrayList;

public class ModulConexiuneInternet {

	
	ArrayList<InterfataStatusConexiune> module = new ArrayList<>();
	
	public void registerModul(InterfataStatusConexiune modul) {
		module.add(modul);
	}
	
	public void unregisterModul(InterfataStatusConexiune modul) {
		module.remove(modul);
	}
	
	public void pierdeConexiune() {
		for(InterfataStatusConexiune modul : module) {
			modul.notificarePierdereConexiune();
;		}
	}
}
