package game.engine.base;

import game.engine.interfaces.Attackee;

public class Wall implements Attackee {
	
	final private int baseHealth; //the original value of the wall’s health
	private int currentHealth;  
	
	public Wall(int baseHealth) {
		super();
		this.baseHealth = baseHealth;
		this.currentHealth = baseHealth;
	}

	public int getCurrentHealth() {
		return currentHealth;
	}

	public void setCurrentHealth(int currentHealth) {
		this.currentHealth = currentHealth;
	}

	public int getBaseHealth() {
		return baseHealth;
	}

	@Override
	public int getResourcesValue() {
		return -1;
	}
	
	
	
	
	
}
