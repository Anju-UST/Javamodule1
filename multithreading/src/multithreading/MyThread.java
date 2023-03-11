package multithreading;

public class MyThread extends Thread {//by extending thread class our class becomes thread , using processor time in a more optimal way
	private String name;
	public MyThread() {
		
	}
	public MyThread(String name) {
		super();
		this.name = name;
	}
	public void run() {
		for(int i=1;i<50;i++)
		{
			System.out.println(name+"="+i);
		}
	}
}
