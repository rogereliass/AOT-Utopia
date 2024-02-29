package game.engine.titans;

public class AbnormalTitan extends Titan {

	private final static int TITAN_CODE = 2;
	
	public AbnormalTitan(int baseHealth, int baseDamage, int heightInMeters, int distanceFromBase, int speed,
			int resourcesValue, int dangerLevel) {
		super(baseHealth, baseDamage, heightInMeters, distanceFromBase, speed, resourcesValue, dangerLevel);
	}

	public int getTITAN_CODE() {
		return TITAN_CODE;
	}
	
	

}
