
public class Multiplication implements Operation{
	public double a,b;
	public double result = 0.0;
	
	public Multiplication(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	public void perform() {
		this.result = this.a*this.b;
	}
}
