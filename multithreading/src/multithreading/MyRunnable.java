package multithreading;
import java.util.Scanner;

public class MyRunnable implements Runnable {
//not a thread only providing space for run()
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
		{
			System.out.println("enter your input:");
			int a =new Scanner(System.in).nextInt();
			System.out.println("got thr ip proceeding");//thraed is blocked for io   
			System.out.println(Thread.currentThread().getName() + "="+i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
