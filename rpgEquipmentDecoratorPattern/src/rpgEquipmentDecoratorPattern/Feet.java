package rpgEquipmentDecoratorPattern;

public class Feet implements Armor{

	@Override
	public String getDescription() {
		return "Feet";
	}

	@Override
	public double getCost() {
		return 3;
	}

	@Override
	public double getDefense() {
		return 3;
	}

	@Override
	public double getSpeed() {
		return 2;
	}
}
