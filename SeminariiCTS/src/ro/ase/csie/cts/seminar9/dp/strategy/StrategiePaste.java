package ro.ase.csie.cts.seminar9.dp.strategy;

public class StrategiePaste implements InterfataBonus{

	@Override
	public int getPuncteBonus(ProfilPlayer player) {
		if(player.playTime > 50)
			return 50;
		else 
			return 0;
	}

}
