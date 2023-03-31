package Structural.adapter.phoneimpl;

import Structural.adapter.phoneifaces.MicroUsbPhone;

public class Android implements MicroUsbPhone {
	private boolean connector;

	@Override
	public void recharge() {
		// TODO Auto-generated method stub
		if(connector) {
			System.out.println("recharge started");
			System.out.println("recharge finished");
		}
		else {
			System.out.println("connect Microusb first");
		}
	}

	@Override
	public void useMicroUsb() {
		// TODO Auto-generated method stub
		connector=true;
		System.out.println("Microusb connected");

	}

}
