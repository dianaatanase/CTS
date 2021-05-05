package ro.ase.csie.cts.seminar10.dp.chain;

public class ModulChatGlobal extends NodChainAbstract{

	public ModulChatGlobal() {
		super("Modul chat global");
	}

	@Override
	public void procesareMesajChat(MesajChat mesaj) {
		if(mesaj.getDestinatie().isEmpty() ||mesaj.getDestinatie().equals("@Everyone")) {
			System.out.println("Mesaj pt toti jucatorii: " + mesaj.getContinut());
		}
		
		if(this.next != null) {
			this.next.procesareMesajChat(mesaj);
		}
	}

}
