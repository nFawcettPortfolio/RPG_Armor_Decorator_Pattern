package rpgEquipmentDecoratorPattern;

public class Steel extends Decorator{

	public Steel(Armor newArmor) {
		super(newArmor);
		System.out.println("Equipping Steel " +newArmor.getDescription());
	}

	public String getDescription() {
		return temp.getDescription() + ", Steel Armor";
	}
	public double getCost() {
		return temp.getCost() *12;
	}
	public double getDefense() {
		return temp.getDefense() *5;
	}
	public double getSpeed() {
		return temp.getSpeed() *-3.5;
	}
}

