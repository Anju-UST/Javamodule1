class seriespattern{
static void method()
{
int a=2,r=2,n=5;
int curr=a;
        for (int i = 0; i < n; i++) {
            curr = a*(int)Math.pow(r, i);
            System.out.print(curr + " ");
        }
}
public static void main(String[] args){
method();
}
}