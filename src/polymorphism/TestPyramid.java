package polymorphism;

public class TestPyramid {

	public static void main(String[] args) {
		PiramidCalculate pc = new PiramidCalculate();
		System.out.println(pc.areaOfPyramid(10, 10));
		
		ModernPiramid mp = new ModernPiramid();
		System.out.println(mp.areaOfPyramid(10, 12));

	}

}
