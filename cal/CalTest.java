package cal;

public class CalTest {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		cal.setOperandOne(10.5);
		cal.setOperandTwo(5.2);
		cal.setOperation("+");
		cal.performOperation();
		System.out.println(cal.getResult());
		
	
	}
}
