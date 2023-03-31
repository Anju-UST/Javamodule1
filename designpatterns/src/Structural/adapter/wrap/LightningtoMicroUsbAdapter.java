package Structural.adapter.wrap;

import Structural.adapter.phoneifaces.LightningPhone;
import Structural.adapter.phoneifaces.MicroUsbPhone;

public class LightningtoMicroUsbAdapter implements MicroUsbPhone {
	private final LightningPhone lightningPhone;

    public LightningtoMicroUsbAdapter(LightningPhone lightningPhone) {
        this.lightningPhone = lightningPhone;
    }

	@Override
	public void recharge() {
		// TODO Auto-generated method stub
		
	lightningPhone.recharge();
	}
	@Override
	public void useMicroUsb() {
		// TODO Auto-generated method stub
		System.out.println("MicroUsb connected");
        lightningPhone.useLightning();
	}

}
