
import model.Cat;
import model.Frog;
import model.TrappedZooKeeper;

public class AnimalNoise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat fluffy = new Cat();
		System.out.println(fluffy.speak());
		
		TrappedZooKeeper jamantha = new TrappedZooKeeper();
		System.out.println(jamantha.speak());
		
		Frog slimey = new Frog();
		System.out.println(slimey.speak());
	}

}
