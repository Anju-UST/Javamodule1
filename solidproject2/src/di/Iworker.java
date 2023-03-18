package di;

public interface Iworker {
	public void work();


class Worker implements Iworker{
	public void work() {}
}
}

abstract class SuperWorker implements Iworker{
	Iworker worker;
	public void setWorker(Iworker w) {
		worker=w;
	}
	public void manage() {
			worker.work();
		}
}
