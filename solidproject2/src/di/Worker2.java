package di;

public class Worker2 {
	public void work() {}

}

class Manager2 {
	
	Worker2 worker;
	
	public void setWorker(Worker2 w) {
		worker=w;
		
	}
	public void manage() {
		worker.work();
	}
}
class SuperWorker2{
	public void work() {
		//......
	}
}