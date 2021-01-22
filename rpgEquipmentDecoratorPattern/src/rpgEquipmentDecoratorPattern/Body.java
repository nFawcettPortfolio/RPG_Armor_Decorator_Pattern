package rpgEquipmentDecoratorPattern;

public class Body implements Armor{

	@Override
	public String getDescription() {
		return "Body";
	}

	@Override
	public double getCost() {
		return 10;
	}

	@Override
	public double getDefense() {
		return 5;
	}

	@Override
	public double getSpeed() {
		return 5;
	}
}
