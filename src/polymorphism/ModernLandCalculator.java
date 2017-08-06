package polymorphism;

public class ModernLandCalculator extends LandCalculator{
public int areaOfLand(int a, int b, int c,int d){
		
		int total = a + b + c + d -3;
		return total;
	}
public int areaOfLand(int a, int b){
	int total= a + b + 10;
	return total;
}
	
}
