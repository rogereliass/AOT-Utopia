package game.engine.weapons;

public class WeaponRegistry {
	
	private final int code;
	private int price;
	private final int damage; 
	private String name;
	private int minRange;
	private int maxRange;
	
	public WeaponRegistry(int code, int price) {
		super();
		this.code = code;
		this.price = price;
		this.damage = 0;

	}
	
	public WeaponRegistry(int code, int price, int damage, String name) {
		super();
		this.code = code;
		this.price = price;
		this.damage = damage;
		this.name = name;
	}
	
	public WeaponRegistry(int code, int price, int damage, String name, int minRange, int maxRange) {
		super();
		this.code = code;
		this.price = price;
		this.damage = damage;
		this.name = name;
		this.minRange = minRange;
		this.maxRange = maxRange;
	}
	
	public int getCode() {
		return code;
	}
	
	public int getPrice() {
		return price;
	}
	
	public int getDamage() {
		return damage;
	}
	
	public String getName() {
		return name;
	}
	
	public int getMinRange() {
		return minRange;
	}
	
	public int getMaxRange() {
		return maxRange;
	}

	@Override
	public String toString() {
		return "WeaponRegistry [code=" + code + ", price=" + price + ", damage=" + damage + ", name=" + name
				+ ", minRange=" + minRange + ", maxRange=" + maxRange + "]";
	}
	public Weapon buildWeapon() { //returns null if invalid code
		switch(this.code) {
		case 1: return new PiercingCannon(this);
		case 2: return new SniperCannon(this);
		case 3: return new VolleySpreadCannon(this);
		case 4: return new WallTrap(this);
		}
		return null; 
	}
	
}