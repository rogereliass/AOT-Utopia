package game.engine.titans;

public class PureTitan extends Titan {
	
	public final static int TITAN_CODE = 1; //attribute made public
	
	public PureTitan(int baseHealth, int baseDamage, int heightInMeters, int distanceFromBase, int speed,
			int resourcesValue, int dangerLevel) {
		super(baseHealth, baseDamage, heightInMeters, distanceFromBase, speed, resourcesValue, dangerLevel);
	}

	public int getTITAN_CODE() {
		return TITAN_CODE;
	}

	@Override
	public int getDamage() {
		return super.getBaseDamage();
	}

	@Override
	public int getDistance() {
		return super.getDistanceFromBase();
	}

	@Override
	public void setDistance(int distance) {
		super.setDistanceFromBase(distance);
	}
	
	

}
