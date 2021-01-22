package rpgEquipmentDecoratorPattern;


public abstract class Decorator implements Armor{
	protected Armor temp;
	public Decorator(Armor newArmor) {
		temp =newArmor;
	}
	public String getDescription() {
		return temp.getDescription();
	}
	public double getCost() {
		return temp.getCost();
	}
	public double getDefense() {
		return temp.getDefense();
	}
	public double getSpeed() {
		return temp.getSpeed();
	}
	
}
