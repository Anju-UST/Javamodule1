package TestLamda;

public class LambdaSwitchCase {
	static double calculate (String operator,double x, double y) {
		
	
	return switch(operator) {
	case "+"-> x+y;
	case "-" -> x-y;
	case "*"->x*y;
	case"/"-> {
		if(y==0) {
			throw new IllegalArgumentException("cant divide by 0");
		}
		yield x/y;
	}
	default->throw new IllegalArgumentException("unknown expression");
	};
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LambdaSwitchCase lsc= new LambdaSwitchCase ();
		System.out.println(lsc.calculate("+",2,3));
		System.out.println(lsc.calculate("-",5,3));
		System.out.println(lsc.calculate("*",2,3));
		System.out.println(lsc.calculate("/",2,3));

	}

}
