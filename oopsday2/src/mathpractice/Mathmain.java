package mathpractice;

public class Mathmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathIface m= new MathImp();
		System.out.println("addition: " + m.add(7, 12));
		System.out.println("subtarction:" + m.sub(10, 5));
		System.out.println("product: " + m.multiply(12, 5));
		System.out.println(" quotient"+ m.div(35, 7));
		System.out.println("remainder: "+ m.rem(40, 7));
		m.prime(13);
		System.out.println("factorial of "   + m.factorial(5));
		m.odd_even(12);
		m.pos_or_neg(-56);
		System.out.println("reverse of "  +m.rev(325));
		

	}

}