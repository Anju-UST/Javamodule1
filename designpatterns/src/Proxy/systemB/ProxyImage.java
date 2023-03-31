package Proxy.systemB;

import Proxy.iface.Image;
import Proxy.systemA.RealImage;

public class ProxyImage  implements Image {
	private final String filename;
	private RealImage image;

	public ProxyImage(String filename) {
		this.filename = filename;
	}
@Override
	public void showImage() {
		
		if (image == null) {
			image = new RealImage(filename);
		}
		image.showImage();
	}
}
