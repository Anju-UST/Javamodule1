class diagonal3{
	static void patternmethod(int n){
	int len=n;
	for(int i=1;i<=n;i++){
		for(int j=1;j<=n;j++){
			if(i==j){
		System.out.print(0+" ");
		}
		else if(j==len)
    		{ 
    		 System.out.print("*"+" ");
    		 }
		else if(i>j){
			System.out.print(1 +" ");
		}
		else if(i<j){
		System.out.print(2 +" ");
		}
			
	}
	System.out.println(" ");
	len--;
}
}



public static void main(String args[]){
int num=5;
patternmethod(num);
}
}