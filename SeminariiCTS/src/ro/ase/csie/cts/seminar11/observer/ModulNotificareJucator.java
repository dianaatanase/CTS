package ro.ase.csie.cts.seminar11.observer;

public class ModulNotificareJucator implements InterfataStatusConexiune  {

	@Override
	public void notificarePierdereConexiune() {
		System.out.println("Pierdere conexiune");
		
	}

}
