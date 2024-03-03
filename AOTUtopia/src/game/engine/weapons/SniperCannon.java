package game.engine.weapons;

public class SniperCannon extends Weapon {
	private final static int WEAPON_CODE =2;

	public SniperCannon(int baseDamage) {
		super(baseDamage);
	}

	public int getWEAPON_CODE() {
		return WEAPON_CODE;
	}

	@Override
	public int getDamage() {
		return super.getBaseDamage();
	}
	
}
