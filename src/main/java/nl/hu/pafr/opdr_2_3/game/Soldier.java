package nl.hu.pafr.opdr_2_3.game;

public class Soldier extends Character {

	public Soldier() {
		setStrength(1);
	}

	public void fight() {
		weapon.useWeapon(strength);
		// other fighting behaviors
	}

}
