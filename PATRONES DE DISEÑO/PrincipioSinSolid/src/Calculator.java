public class Calculator {
	
	
	public void calculate(Operation operation) throws Exception {
		if(operation ==null) {
			throw new Exception("Can not perfomn this operation");
		}else if(operation instanceof Multiplication) {
			Multiplication ml = (Multiplication) operation;
			ml.result = ml.a * ml.b;
		}
	}
	
	public static void main(String[] args) throws Exception {
		Calculator obj = new Calculator();
		
		Multiplication ml = new Multiplication(3,4);
		
		obj.calculate(ml);	
		
		System.out.println("El resultado es: " + ml.result);
		
	}
}
