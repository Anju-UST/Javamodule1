package another;
import source.Parent;

public class NonSubClass {
	public NonSubClass() {
		// TODO Auto-generated constructor stub
	
	Parent p= new Parent();
	System.out.println(p.d);//only public is visible
	
	}
}
