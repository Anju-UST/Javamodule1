class pattern{

	static void patternmethod(int num){
	
	for(int i=1;i<=num;i++){
		for(int j=1;j<=i;j++){
			System.out.print("1");
		}
		System.out.println(" ");
	}
	}
	public static void main(String args[]){
	int n=5;
	patternmethod(n);
	
	}
}