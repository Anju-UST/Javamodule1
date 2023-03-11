package oopsday3.lines;



public class Line implements DrawFace {
	
	Point p1= new Point();
	Point p2=new Point();
	public void drawline(Point p1,Point p2) {
		int i=0;
		for(p1.getX();i<p2.getX();i++) {
			System.out.print(".");
			
		}
	}
	
	
	
}
