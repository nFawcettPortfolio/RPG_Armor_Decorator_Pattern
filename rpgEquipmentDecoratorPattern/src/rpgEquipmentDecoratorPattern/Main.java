package rpgEquipmentDecoratorPattern;

public class Main {
	public static void main(String[] args) {
		double baseSpeed =100;
		double totalSpeed;
		double totalDefense;
		
		System.out.println("Helm");
		Armor helm = new Leather(new Helm());
		System.out.println("Descriptsion: " + helm.getDescription());
		System.out.println("Cost: " + helm.getCost()+" GP");
		System.out.println("Defense Rating: " +helm.getDefense());
		System.out.println("Speed: " +helm.getSpeed());
		
		System.out.println("\nBody");
		Armor body = new Iron(new Body());
		System.out.println("Descriptsion: " + body.getDescription());
		System.out.println("Cost: " + body.getCost()+" GP");
		System.out.println("Defense Rating: " +body.getDefense());
		System.out.println("Speed: " +body.getSpeed());
		
		System.out.println("\nGloves");
		Armor gloves = new Leather(new Gloves());
		System.out.println("Descriptsion: " + gloves.getDescription());
		System.out.println("Cost: " + gloves.getCost()+" GP");
		System.out.println("Defense Rating: " +gloves.getDefense());
		System.out.println("Speed: " +gloves.getSpeed());
		
		System.out.println("\nFeet");
		Armor feet = new Steel(new Feet());
		System.out.println("Descriptsion: " + feet.getDescription());
		System.out.println("Cost: " + feet.getCost()+" GP");
		System.out.println("Defense Rating: " +feet.getDefense());
		System.out.println("Speed: " +feet.getSpeed());
		
		totalDefense = helm.getDefense()+body.getDefense()+gloves.getDefense()+feet.getDefense();
		totalSpeed=baseSpeed+helm.getSpeed()+body.getSpeed()+gloves.getSpeed()+feet.getSpeed();
		
		System.out.println("\nStats");
		System.out.println("Defense: " +totalDefense);
		System.out.println("Speed: "+totalSpeed);
	}
}
