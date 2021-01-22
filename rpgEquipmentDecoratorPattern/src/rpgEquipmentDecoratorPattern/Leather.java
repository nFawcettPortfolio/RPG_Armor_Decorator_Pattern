package rpgEquipmentDecoratorPattern;

public class Leather extends Decorator{

	public Leather(Armor newArmor) {
		super(newArmor);
		System.out.println("Equipping Leather " +newArmor.getDescription());
	}

	public String getDescription() {
		return temp.getDescription() + ", Leather Armor";
	}
	public double getCost() {
		return temp.getCost() *3;
	}
	public double getDefense() {
		return temp.getDefense() *2;
	}
	public double getSpeed() {
		return temp.getSpeed() *-1;
	}
}

