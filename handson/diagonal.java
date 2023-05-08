class diagonal{
	static void patternmethod(){
	int n=3;
	for(int i=1;i<=n;i++){
		for(int j=1;j<=n;j++){
			if(i==j){
		System.out.print(1+" ");
		}
		else{
		System.out.print(0 +" ");
		}
	}
	System.out.println(" ");
}
}

public static void main(String args[]){
patternmethod();
}
}