package polymorphism;

public class PiramidCalculate {
	 
	public double areaOfPyramid(int a, int b){
		double area= a*b;
		return area;
	}
	public final double areaOfPyramid(int a, int b, int c){
		double area= a*b*c;
		return area;
	}
	public double areaOfPyramid(int a, int b,int c,int d ){
		double area= a*b*c*d;
		return area;
	}

}
