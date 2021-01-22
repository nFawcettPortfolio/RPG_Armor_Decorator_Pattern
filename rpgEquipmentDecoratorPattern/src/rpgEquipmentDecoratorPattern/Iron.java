package rpgEquipmentDecoratorPattern;

public class Iron extends Decorator{

	public Iron(Armor newArmor) {
		super(newArmor);
		System.out.println("Equipping Iron " +newArmor.getDescription());
	}

	public String getDescription() {
		return temp.getDescription() + ", Iron Armor";
	}
	public double getCost() {
		return temp.getCost() *10;
	}
	public double getDefense() {
		return temp.getDefense() *4;
	}
	public double getSpeed() {
		return temp.getSpeed() *-3;
	}
}

