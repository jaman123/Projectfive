package nestedClass;

public class OuterClass {
	
	InnerA innerA = new InnerA();
	InnerB innerB = new InnerB();
	
	public void outerMethod(){
		System.out.println("you can access from outside");
		innerA.innerA();
		innerB.innerB();
	}
	private class InnerA{
		private void innerA(){
		System.out.println("This is a innerA");
		}
	}
	private class InnerB{
		private void innerB(){
			System.out.println("This is a innerB");
		}
		
		
	}

}
