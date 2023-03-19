package cal;

public class Calculator {
//	create default constructor
	public Calculator() {}

//	create needed variables
	private double operandOne;
	private double operandTwo;
	private String operation;
	private double result;
	
//	create setters and getters
	public double getOperandOne() {
		return operandOne;
	}
	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}
	
	public double getOperandTwo() {
		return operandTwo;
	}
	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}
	
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	
//	create perform operation method
	public void performOperation(double oOne, double oTwo, String operation) {
		if (operation.equals("+")) {
			setResult(oOne + oTwo);
			System.out.println(getResult());
		}
		else if (operation.equals("-")) {
			setResult(oOne - oTwo);
			System.out.println(getResult());
		}
		else {
			System.out.println("Please input either '+' or '-'");
		}
			
	}

}
