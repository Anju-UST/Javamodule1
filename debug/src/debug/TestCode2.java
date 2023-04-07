package debug;

public class TestCode2 {
	int a;
	int b;
	int x;
	int result=0;
	int a1[]={2,5,7,8,5};
	int b1[]= {23,43,27,32,12};
	int x1[] ={18,19,20,21,22};
	//ax^2+bx^2+2ab
	void sqrt() {
	for(int i=0; i<5;i++) {
			a=a1[i];
			b=b1[i];
			x=x1[i];
			a=(a*(x*x)); 
			b=(b*(x*x));
			x=(2*a*b);
			
//				a=(a1[i]*(x1[i]*x1[i])); 
//				b=(b1[i]*(x1[i]*x1[i]));
//				x=(2*a1[i]*b1[i]);
				System.out.println(a+b+x);
		
	}
	}
	
	public static void main(String[] args) {
		new TestCode2().sqrt();
	}

}