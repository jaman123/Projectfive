package polymorphism;

public class TestLandCalculator {

	public static void main(String[] args) {
		LandCalculator landCalculator = new LandCalculator();
		System.out.println(landCalculator.areaOfLand(4, 44));
		System.out.println(landCalculator.areaOfLand(4, 4,4,4));

		ModernLandCalculator mlc = new ModernLandCalculator();
		System.out.println(mlc.areaOfLand(2, 2));
		
	}

}
