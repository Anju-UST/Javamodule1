package Proxy.test;

import Proxy.iface.Image;
import Proxy.systemA.RealImage;
import Proxy.systemB.ProxyImage;

public class TestProxy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Image image1 = new RealImage("HiRes_10MB_Photo1");
		Image image2 = new ProxyImage("HiRes_10MB_Photo2");

		image1.showImage(); // loading necessary
		image1.showImage(); // loading unnecessary
		image2.showImage(); // loading necessary
		image2.showImage(); // loading unnecessary
		image1.showImage(); // loading unnecessary
	}

	
}
