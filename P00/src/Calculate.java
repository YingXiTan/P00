
public class Calculate {

	public int add (int a, int b) {
		return a + b;

	}
	
	public int subtract (int a, int b) {
		return a - b;
	}
	
	public int mutiply (int a, int b) {
		return a * b;
	}
	
	public int divide (int a, int b) {
		if (b == 0) {
			throw new IllegalArgumentException();
		}
		return a/b;
	}

}
