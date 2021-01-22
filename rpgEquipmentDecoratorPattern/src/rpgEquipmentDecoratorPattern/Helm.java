package rpgEquipmentDecoratorPattern;

public class Helm implements Armor{

	@Override
	public String getDescription() {
		return "Helm";
	}

	@Override
	public double getCost() {
		return 4;
	}

	@Override
	public double getDefense() {
		return 2;
	}

	@Override
	public double getSpeed() {
		return 1;
	}
}
