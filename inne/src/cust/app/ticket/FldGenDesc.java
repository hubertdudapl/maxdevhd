package cust.app.ticket;

import java.rmi.RemoteException;

import psdi.mbo.Mbo;
import psdi.mbo.MboValue;
import psdi.mbo.MboValueAdapter;
import psdi.util.MXException;

public class FldGenDesc extends MboValueAdapter {

	public FldGenDesc(MboValue mbv) {
		super(mbv);
	}
	@Override
	public void initValue() throws MXException, RemoteException {
		// TODO Auto-generated method stub
		super.initValue();
		MboValue mv= this.getMboValue();
		Mbo mbo = mv.getMbo();
		if ( mbo.isNew()){
			mv.setValue("********Hello from MboValueAdapter class*******", NOACCESSCHECK | NOVALIDATION);
		}
	}

	
	
}
