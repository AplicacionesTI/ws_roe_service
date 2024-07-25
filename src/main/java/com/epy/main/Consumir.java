package com.epy.main;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import com.labroe.ww2.servicios.LocalSE_asmx.LocalSE;
import com.labroe.ww2.servicios.LocalSE_asmx.LocalSELocator;
import com.labroe.ww2.servicios.LocalSE_asmx.LocalSESoap;

public class Consumir {

	public static void main(String[] args) throws ServiceException, RemoteException {

		LocalSE locator = new LocalSELocator();
		LocalSESoap proxy = locator.getLocalSESoap();
		
		
		String rpta = proxy.getOrdenResultados("526857");
		
		System.out.println(rpta);
		
		
		
		
		

	}

}
