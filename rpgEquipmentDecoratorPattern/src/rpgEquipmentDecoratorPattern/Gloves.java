package rpgEquipmentDecoratorPattern;

public class Gloves implements Armor{

	@Override
	public String getDescription() {
		return "Gloves";
	}

	@Override
	public double getCost() {
		return 2;
	}

	@Override
	public double getDefense() {
		return 1;
	}

	@Override
	public double getSpeed() {
		return 1;
	}
}
