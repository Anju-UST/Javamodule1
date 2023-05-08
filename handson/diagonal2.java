class seriespattern{
static void method()
{
int m=5;
for(int i=1;i<=m;i++){
for(int j=1;j<=m;j++){
if(i==j){
System.out.print(0+" ");
}

else if(i>j){
System.out.print(1+" ");
}
else if(i<j){
System.out.print(2 +" ");
}
}
System.out.println(" ");
}
}
public static void main(String[] args){
method();
}
}