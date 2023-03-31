package mathpractice;

public class MathImp implements MathIface {
	
	public MathImp() {
		
	}
	

	@Override
	public double add(double a, double b) {
		// TODO Auto-generated method stub
		return a + b;
	}

	@Override
	public double sub(double c, double d) {
		// TODO Auto-generated method stub
		return c - d;
	}

	@Override
	public double multiply(double e, double f) {
		// TODO Auto-generated method stub
		return e*f;
	}

	@Override
	public double div(double x, double y) {
		// TODO Auto-generated method stub
		return x/y;
	}

	@Override
	public double rem(double p, double q) {
		// TODO Auto-generated method stub
		return p%q;
	}

	@Override
	public void prime(int n) {
		// TODO Auto-generated method stub
		boolean flag = false;
	    for (int i = 2; i <= n / 2; ++i) {
	      
	      if (n % i == 0) {
	        flag = true;
	        break;
	      }
	    }
	    if(!flag)
	    System.out.println("prime");
	    else
	    System.out.println("not prime");
	}

	@Override
	public int factorial(int n) {
		int f=1;
		for(int i=1;i<=n;i++) {
			f=f*i;
		}
		return f;
	}

	@Override
	public void odd_even(int n) {
		// TODO Auto-generated method stub
		if(n%2==0)
		{
			System.out.println("given number is even");
		}
		else
			System.out.println("number is odd");
	}

	@Override
	public void pos_or_neg(int n) {
		// TODO Auto-generated method stub
		if(n>0)
			System.out.println("positive");
		else
			System.out.println("negative");
	}

	@Override
	public int rev(int n) {
		// TODO Auto-generated method stub
		int rem;
		int rev=0;
		while(n>0)
		{
			rem=n%10;
			rev=(rev*10) + rem;
			n=n/10;
		}
		return rev;
	}

}
